package com.frmnjn.liquibase.service;

import com.frmnjn.liquibase.entity.Friend;
import com.frmnjn.liquibase.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService {

    @Autowired
    FriendRepository friendRepository;

    public Friend createFriend(Friend friend) {
        return friendRepository.save(friend);
    }
}
