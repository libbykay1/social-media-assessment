package com.groupfour.socialmedia.mappers;

import com.groupfour.socialmedia.dtos.UserRequestDto;
import com.groupfour.socialmedia.dtos.UserResponseDto;
import com.groupfour.socialmedia.entities.Credentials;
import com.groupfour.socialmedia.entities.User;
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
public class UserMapperImpl implements UserMapper {

    @Autowired
    private ProfileMapper profileMapper;
    @Autowired
    private CredentialsMapper credentialsMapper;

    @Override
    public UserResponseDto entityToDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserResponseDto userResponseDto = new UserResponseDto();

        userResponseDto.setUsername( entityCredentialsUsername( entity ) );
        userResponseDto.setProfile( profileMapper.entityToDto( entity.getProfile() ) );
        userResponseDto.setJoined( entity.getJoined() );

        return userResponseDto;
    }

    @Override
    public User responseDtoToEntity(UserResponseDto userResponseDto) {
        if ( userResponseDto == null ) {
            return null;
        }

        User user = new User();

        user.setProfile( profileMapper.dtoToEntity( userResponseDto.getProfile() ) );
        user.setJoined( userResponseDto.getJoined() );

        return user;
    }

    @Override
    public User requestDtoToEntity(UserRequestDto userRequestDto) {
        if ( userRequestDto == null ) {
            return null;
        }

        User user = new User();

        user.setCredentials( credentialsMapper.dtoToEntity( userRequestDto.getCredentials() ) );
        user.setProfile( profileMapper.dtoToEntity( userRequestDto.getProfile() ) );

        return user;
    }

    @Override
    public List<UserResponseDto> entitiesToDtos(List<User> entities) {
        if ( entities == null ) {
            return null;
        }

        List<UserResponseDto> list = new ArrayList<UserResponseDto>( entities.size() );
        for ( User user : entities ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> dtosToEntities(List<UserResponseDto> userResponseDtos) {
        if ( userResponseDtos == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userResponseDtos.size() );
        for ( UserResponseDto userResponseDto : userResponseDtos ) {
            list.add( responseDtoToEntity( userResponseDto ) );
        }

        return list;
    }

    private String entityCredentialsUsername(User user) {
        if ( user == null ) {
            return null;
        }
        Credentials credentials = user.getCredentials();
        if ( credentials == null ) {
            return null;
        }
        String username = credentials.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
