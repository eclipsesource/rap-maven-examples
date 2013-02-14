package com.eclipsesource.rap.examples.maven;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;
import org.eclipse.rap.rwt.client.WebClient;

public class DemoApplicationConfiguration implements ApplicationConfiguration {

	public void configure(Application application) {
		Map<String, String> properties = new HashMap<String, String>();
		properties.put(WebClient.PAGE_TITLE, "RAP Maven Demo");
		application.addEntryPoint("/maven_example", DemoApplication.class, properties );
	}

}
