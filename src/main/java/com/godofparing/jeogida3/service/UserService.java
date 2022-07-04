package com.godofparing.jeogida3.service;

import com.godofparing.jeogida3.dto.UserDto;

import java.util.List;

public interface UserService {
    public List<UserDto> getUserList();

    public UserDto getUser(Integer id);

    public boolean insertUser(UserDto userDto);

    public Integer findByEmail(String email);

    public boolean updateUser(Integer id, UserDto userDto);

    public boolean deleteUser(Integer id);
}