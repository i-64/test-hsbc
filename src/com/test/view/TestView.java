package com.test.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.test.controller.TestControllerInterface;
import com.test.utilities.ControllerFactory;

public class TestView {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			TestControllerInterface t = ControllerFactory.createObject();
			
			while (true) {
				
				System.out.println("\n\n1. Create\n2. View\n3. View all\n4. Delete\n>> ");
				int choice = Integer.parseInt(br.readLine());
				
				switch (choice) {
					case 0:
						return;
					case 1:
						t.createProfile();
						break;
					case 2:
						t.viewProfile();
						break;
					case 3:
						t.viewAllProfiles();
						break;
					case 4:
						t.deleteProfile();
						break;
					default:
						System.out.println("Invalid choice :\"(");
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
