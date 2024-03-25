package com.groupfour.socialmedia.mappers;

import com.groupfour.socialmedia.dtos.HashtagResponseDto;
import com.groupfour.socialmedia.entities.Hashtag;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-02T10:08:26-0800",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class HashtagMapperImpl implements HashtagMapper {

    @Override
    public HashtagResponseDto hashtagEntityToDto(Hashtag entity) {
        if ( entity == null ) {
            return null;
        }

        HashtagResponseDto hashtagResponseDto = new HashtagResponseDto();

        hashtagResponseDto.setLabel( entity.getLabel() );
        hashtagResponseDto.setFirstUsed( entity.getFirstUsed() );
        hashtagResponseDto.setLastUsed( entity.getLastUsed() );

        return hashtagResponseDto;
    }

    @Override
    public List<HashtagResponseDto> hashtagEntitiesToDtos(List<Hashtag> hashtags) {
        if ( hashtags == null ) {
            return null;
        }

        List<HashtagResponseDto> list = new ArrayList<HashtagResponseDto>( hashtags.size() );
        for ( Hashtag hashtag : hashtags ) {
            list.add( hashtagEntityToDto( hashtag ) );
        }

        return list;
    }

    @Override
    public List<Hashtag> dtosToHashtagEntities(List<HashtagResponseDto> hashtagResponseDtos) {
        if ( hashtagResponseDtos == null ) {
            return null;
        }

        List<Hashtag> list = new ArrayList<Hashtag>( hashtagResponseDtos.size() );
        for ( HashtagResponseDto hashtagResponseDto : hashtagResponseDtos ) {
            list.add( hashtagResponseDtoToHashtag( hashtagResponseDto ) );
        }

        return list;
    }

    protected Hashtag hashtagResponseDtoToHashtag(HashtagResponseDto hashtagResponseDto) {
        if ( hashtagResponseDto == null ) {
            return null;
        }

        Hashtag hashtag = new Hashtag();

        hashtag.setLabel( hashtagResponseDto.getLabel() );
        hashtag.setFirstUsed( hashtagResponseDto.getFirstUsed() );
        hashtag.setLastUsed( hashtagResponseDto.getLastUsed() );

        return hashtag;
    }
}
