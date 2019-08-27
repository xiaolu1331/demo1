package com.example1.demo1.bootlaunch.model.yaml;

import lombok.Data;

import java.util.List;

@Data
public class Child {
    private String name;
    private Integer age;
    private List<Friend> friends;
}