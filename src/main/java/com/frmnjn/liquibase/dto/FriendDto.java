package com.frmnjn.liquibase.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FriendDto {
    private String name;
    private String age;
    private String address;
    private String phoneNumber;
}
