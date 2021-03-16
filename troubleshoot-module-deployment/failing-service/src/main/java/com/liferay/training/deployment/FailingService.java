package com.liferay.training.deployment;

import com.liferay.training.deployment.api.FailingApi;
import com.liferay.training.deployment.reference.FailingServiceReference;

import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liferay
 */
@Component(
	immediate = true,
	service = FailingApi.class
)
public class FailingService implements FailingApi {
	
	@Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		printMessage();
	}

	@Override
	public void printMessage() {
		
		if (_failingServiceReference != null) {

			_log.info("###################################");
			_log.info(_failingServiceReference.getStatus());
			_log.info("###################################");

		} else {
			_log.error("There's a problem!");
		}

	}

	@Reference
	FailingServiceReference _failingServiceReference;
	
	Logger _log = LoggerFactory.getLogger(FailingService.class);
	
}