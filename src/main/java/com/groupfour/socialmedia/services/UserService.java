package com.groupfour.socialmedia.services;

import java.util.List;

import com.groupfour.socialmedia.dtos.CredentialsDto;
import com.groupfour.socialmedia.dtos.TweetResponseDto;
import com.groupfour.socialmedia.dtos.UserRequestDto;
import com.groupfour.socialmedia.dtos.UserResponseDto;
import com.groupfour.socialmedia.entities.User;

public interface UserService {
	User getUserEntity(String username);

	List<UserResponseDto> getAllUsers();

	UserResponseDto createNewUser(UserRequestDto userRequestDto);

	UserResponseDto getUserByUsername(String username);

	UserResponseDto updateUser(UserRequestDto userRequestDto, String username);

	UserResponseDto deleteUser(String username, CredentialsDto credentials);

	void addFollow(String username, CredentialsDto credentialsDto);

	void unfollow(CredentialsDto credentialsDto, String username);

	List<TweetResponseDto> getFeed(String username);

	List<TweetResponseDto> getUserTweets(String username);

	List<TweetResponseDto> getMentions(String username);

	List<UserResponseDto> getUserFollowers(String username);

	List<UserResponseDto> getFollowing(String username);

	List<TweetResponseDto> reverseChronological(List<TweetResponseDto> tweets);

}
