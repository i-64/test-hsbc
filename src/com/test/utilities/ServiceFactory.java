package com.test.utilities;

import com.test.service.TestService;
import com.test.service.TestServiceInterface;

public class ServiceFactory {
	private ServiceFactory () {
		;
	}
	public static TestServiceInterface createObject () {
		return (new TestService());
	}
}
