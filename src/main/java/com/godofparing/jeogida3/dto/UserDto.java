package com.godofparing.jeogida3.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private Integer id;
    private String email;
    private String nickname;
    private String password;
}