package com.test.dao;

import java.util.ArrayList;

import com.test.utilities.*;

public interface TestDAOInterface {
	public int createProfileDAO (User u);
	public User viewProfileDAO (User u) throws UserNotFoundException;
	public ArrayList<User> viewAllProfilesDAO ();
	public int deleteProfileDAO (User u) throws UserNotFoundException;
}
