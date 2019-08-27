package com.example1.demo1.bootlaunch.model.yaml;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Friend {
    private String hobby;

    private String sex;
}