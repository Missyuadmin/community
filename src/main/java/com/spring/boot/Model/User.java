package com.spring.boot.Model;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String accountId;

    private String name;

    private String token;

    private Long gmtCreate;

    private Long gmtModified;
}