package com.test.utilities;

import com.test.controller.TestController;
import com.test.controller.TestControllerInterface;

public class ControllerFactory {
	private ControllerFactory () {
		;
	}
	public static TestControllerInterface createObject () {
		return (new TestController());
	}
}
