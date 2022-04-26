package com.frmnjn.liquibase.controller;

import com.frmnjn.liquibase.dto.FriendDto;
import com.frmnjn.liquibase.entity.Friend;
import com.frmnjn.liquibase.service.FriendService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/friend")
public class FriendController {

    @Autowired
    FriendService friendService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public Friend createFriend(@RequestBody FriendDto friendDto) {
        Friend friend = modelMapper.map(friendDto, Friend.class);
        return friendService.createFriend(friend);
    }
}
