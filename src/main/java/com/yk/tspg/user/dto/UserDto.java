package com.yk.tspg.user.dto;

import com.yk.tspg.user.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = { User.class })
public interface UserDto {

    String getEmail();

    String getNickname();

}
