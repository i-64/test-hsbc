package com.test.service;

import java.util.ArrayList;

import com.test.dao.*;
import com.test.utilities.User;
import com.test.utilities.UserNotFoundException;

public class TestService implements TestServiceInterface {

	private TestDAOInterface t;
	
	public TestService () {
		t = new TestDAO();
	}

	@Override
	public int createProfileService(User u) {
		// TODO Auto-generated method stub
		return t.createProfileDAO(u);
	}

	@Override
	public User viewProfileService(User u) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return t.viewProfileDAO(u);
	}
	
	@Override
	public ArrayList<User> viewAllProfilesService() {
		return t.viewAllProfilesDAO();
	}

	@Override
	public int deleteProfileService(User u) throws UserNotFoundException {
		// TODO Auto-generated method stub
		return t.deleteProfileDAO(u);
	}

}
