package com.liferay.training.deployment.formatter;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.List;

import org.osgi.service.component.annotations.Component;

@Component(
	immediate = true,
	service = StringFormatter.class
)

public class StringFormatterImpl implements StringFormatter {

	@Override
	public String getString() {

		List<String> wordList = Lists.newArrayList("Task", "completed", "succesfully!");
	    
	    return Joiner.on(" ").join(wordList);
	}
}
