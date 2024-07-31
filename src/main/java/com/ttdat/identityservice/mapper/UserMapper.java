package com.ttdat.identityservice.mapper;

import com.ttdat.identityservice.dto.request.UserCreationRequest;
import com.ttdat.identityservice.dto.request.UserUpdateRequest;
import com.ttdat.identityservice.dto.response.UserResponse;
import com.ttdat.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);
    @Mapping(target = "lastName", ignore = true)
    UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget  User user, UserUpdateRequest request);
}
