package com.test.service;

import java.util.ArrayList;

import com.test.utilities.User;
import com.test.utilities.UserNotFoundException;

public interface TestServiceInterface {
	public int createProfileService (User u);
	public User viewProfileService (User u) throws UserNotFoundException;
	public ArrayList<User> viewAllProfilesService ();
	public int deleteProfileService (User u) throws UserNotFoundException;
}
