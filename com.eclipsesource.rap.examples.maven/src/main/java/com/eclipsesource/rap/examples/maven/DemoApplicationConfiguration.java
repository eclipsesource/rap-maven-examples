package com.eclipsesource.rap.examples.maven;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rwt.application.Application;
import org.eclipse.rwt.application.ApplicationConfiguration;
import org.eclipse.rwt.client.WebClient;

public class DemoApplicationConfiguration implements ApplicationConfiguration {

	public void configure(Application application) {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put(WebClient.PAGE_TITLE, "RAP Maven Demo");
		application.addEntryPoint("/maven_example", DemoApplication.class, properties );
	}

}
