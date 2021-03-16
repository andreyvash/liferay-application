package com.liferay.training.deployment.reference;

import com.liferay.training.deployment.formatter.StringFormatter;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
	immediate = true,
	service = FailingServiceReference.class
)
public class FailingServiceReferenceImpl implements FailingServiceReference {

	@Override
	public String getStatus() {
		
		return _stringFormatter.getString();
	}
	
	@Reference
	StringFormatter _stringFormatter;
}
