package com.tss.read.component;

/**
 * @author huzaifa bhavnagri
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropReader {

	@Value("${application.name}")
	private String projectName;

	@Value("${server.port}")
	private String serverPort;

	public String getProjectName() {
		return projectName;
	}

	public String getServerPort() {
		return serverPort;
	}
}