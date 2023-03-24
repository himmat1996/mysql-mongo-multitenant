package com.spring.mongo.multitenant.mysql.user;

import lombok.Builder;
import lombok.Getter;

@Builder @Getter
public class User {
    private final String username;
    private final String email;
    private final String phone;
}
