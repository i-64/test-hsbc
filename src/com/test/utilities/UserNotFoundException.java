/**
 * 
 */
package com.test.utilities;

/**
 * @author i-64
 *
 */
@SuppressWarnings("serial")
public class UserNotFoundException extends Exception {
	
	@Override
	public String toString () {
		return "User not found :\"(";
	}
}
