package com.tss.read;

/**
 * @author huzaifa bhavnagri
 */
import org.springframework.web.bind.annotation.RestController;

import com.tss.read.component.PropReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DefaultController {

	@Autowired
	PropReader propReader;

	@RequestMapping("/readProperty")
	public String sayHello() {
		return "Reading Property from Propery File : </br>" + "application.name: \"" + propReader.getProjectName()
				+ "\"</br>" + "server.port: \"" + propReader.getServerPort() + "\"";

	}
}