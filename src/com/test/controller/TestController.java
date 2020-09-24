package com.test.controller;

import java.util.ArrayList;
import java.io.*;

import com.test.service.TestService;
import com.test.utilities.*;

public class TestController implements TestControllerInterface {

	private TestService t;
	BufferedReader br;
	
	public TestController () {
		t = new TestService();
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	@Override
	public void createProfile() {
		try {
			System.out.print("Name >> ");
			String name = br.readLine();
			System.out.print("Email >> ");
			String email = br.readLine();
			System.out.print("Phone >> ");
			String phone = br.readLine();
			User u = new User();
			u.setName(name);
			u.setEmail(email);
			u.setPhone(phone);
			if (t.createProfileService(u) == 1)
				System.out.println("User created successfully :)");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void viewProfile() {
		try {
			System.out.print("Name >> ");
			String name = br.readLine();
			System.out.print("Email >> ");
			String email = br.readLine();
			System.out.print("Phone >> ");
			String phone = br.readLine();
			User u = new User();
			u.setName(name);
			u.setEmail(email);
			u.setPhone(phone);
			User fetchedUser = t.viewProfileService(u);
			System.out.println(fetchedUser);
		}
		catch (IOException|UserNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void viewAllProfiles() {
		ArrayList<User> l = t.viewAllProfilesService();
		for (User u: l)
			System.out.println(u);
	}

	@Override
	public void deleteProfile() {
		try {
			System.out.print("Name >> ");
			String name = br.readLine();
			System.out.print("Email >> ");
			String email = br.readLine();
			System.out.print("Phone >> ");
			String phone = br.readLine();
			User u = new User();
			u.setName(name);
			u.setEmail(email);
			u.setPhone(phone);
			if (t.deleteProfileService(u) == 1)
				System.out.println("User deleted successfully");
			else
				System.out.println("Could not delete user");
		}
		catch (IOException|UserNotFoundException e) {
			e.printStackTrace();
		}
	}
}
