package com.groupfour.socialmedia.services;

import com.groupfour.socialmedia.dtos.ContextDto;
import com.groupfour.socialmedia.dtos.CredentialsDto;
import com.groupfour.socialmedia.dtos.HashtagResponseDto;
import com.groupfour.socialmedia.dtos.TweetRequestDto;
import com.groupfour.socialmedia.dtos.TweetResponseDto;
import com.groupfour.socialmedia.dtos.UserResponseDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface TweetService {

	List<TweetResponseDto> getAllTweets();

	TweetResponseDto createTweet(TweetRequestDto tweetRequestDto);

	TweetResponseDto getTweetById(Long id);

	TweetResponseDto deleteTweet(Long id);

	void likeTweet(CredentialsDto credentialsDto, Long id);

	TweetResponseDto createReply(TweetRequestDto tweetRequestDto, Long id);

	TweetResponseDto createRepost(CredentialsDto credentialsDto, Long id);

	List<HashtagResponseDto> getTagsOfTweet(Long id);

	List<UserResponseDto> getUsersWhoLikedTweet(Long id);

	List<UserResponseDto> getUsersWhoLiked(Long id);

	ContextDto getContext(Long id);

	List<TweetResponseDto> getReplies(Long id);

	List<TweetResponseDto> getReposts(Long id);

	List<UserResponseDto> getMentionedUsers(Long id);

}
