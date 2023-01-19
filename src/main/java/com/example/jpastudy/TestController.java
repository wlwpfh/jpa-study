package com.example.jpastudy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public UserDto test(){
        UserDto userDto=new UserDto();
        userDto.setAge(20);
        userDto.setName("hoon");

        return userDto;
    }
}
