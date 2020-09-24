package com.test.utilities;

import com.test.dao.TestDAO;
import com.test.dao.TestDAOInterface;

public class DAOFactory {
	private DAOFactory () {
		;
	}
	public static TestDAOInterface createObject () {
		return (new TestDAO());
	}
}
