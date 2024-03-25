package com.groupfour.socialmedia.services;

public interface ValidateService {

	boolean validateUsernameExists(String username);

	boolean validateUsernameAvailable(String username);

	boolean validateHashtagExists(String label);

	boolean validateCredentialsExist(String username, String password);

}
