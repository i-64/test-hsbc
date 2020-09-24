package com.test.dao;

import java.util.ArrayList;

import com.test.utilities.*;

public class TestDAO implements TestDAOInterface {

	private ArrayList <User> l;
	public TestDAO() {
		l = new ArrayList<>();
	}
	
	@Override
	public int createProfileDAO (User u) {
		if (l.add(u))
			return 1;
		return 0;
	}

	@Override
	public User viewProfileDAO (User u1) throws UserNotFoundException {
		int idx = l.indexOf(u1);
		if (idx >= 0)
			return (l.get(idx));
		else
			throw (new UserNotFoundException());
	}

	@Override
	public ArrayList <User> viewAllProfilesDAO() {
		ArrayList <User> ret = l;
		return ret;
	}

	@Override
	public int deleteProfileDAO(User u1) throws UserNotFoundException {
		if (l.remove(u1))
			return 1;
		else
			throw (new UserNotFoundException());
	}
	
}
