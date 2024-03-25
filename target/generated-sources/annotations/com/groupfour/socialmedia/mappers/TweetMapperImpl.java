package com.groupfour.socialmedia.mappers;

import com.groupfour.socialmedia.dtos.TweetRequestDto;
import com.groupfour.socialmedia.dtos.TweetResponseDto;
import com.groupfour.socialmedia.entities.Tweet;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-02T10:08:27-0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class TweetMapperImpl implements TweetMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public TweetResponseDto entityToDto(Tweet entity) {
        if ( entity == null ) {
            return null;
        }

        TweetResponseDto tweetResponseDto = new TweetResponseDto();

        tweetResponseDto.setId( entity.getId() );
        tweetResponseDto.setAuthor( userMapper.entityToDto( entity.getAuthor() ) );
        tweetResponseDto.setPosted( entity.getPosted() );
        tweetResponseDto.setContent( entity.getContent() );
        tweetResponseDto.setInReplyTo( entityToDto( entity.getInReplyTo() ) );
        tweetResponseDto.setRepostOf( entityToDto( entity.getRepostOf() ) );

        return tweetResponseDto;
    }

    @Override
    public List<TweetResponseDto> entitiesToDtos(List<Tweet> entities) {
        if ( entities == null ) {
            return null;
        }

        List<TweetResponseDto> list = new ArrayList<TweetResponseDto>( entities.size() );
        for ( Tweet tweet : entities ) {
            list.add( entityToDto( tweet ) );
        }

        return list;
    }

    @Override
    public Tweet requestDtoToEntity(TweetRequestDto questionRequestDto) {
        if ( questionRequestDto == null ) {
            return null;
        }

        Tweet tweet = new Tweet();

        tweet.setContent( questionRequestDto.getContent() );

        return tweet;
    }

    @Override
    public List<Tweet> requestDtosToEntities(List<TweetRequestDto> tweetRequestDtos) {
        if ( tweetRequestDtos == null ) {
            return null;
        }

        List<Tweet> list = new ArrayList<Tweet>( tweetRequestDtos.size() );
        for ( TweetRequestDto tweetRequestDto : tweetRequestDtos ) {
            list.add( requestDtoToEntity( tweetRequestDto ) );
        }

        return list;
    }
}
