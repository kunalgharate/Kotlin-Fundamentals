package com.example.kotlinpractice.samInterfaceEx;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class User {
    String name;


    public User(String name) {
        this.name = name;
    }

    public void create(UserCreated created)
    {
        created.onCreate(this);
    }

    @NonNull
    @NotNull
    @Override
    public String toString() {
        return super.toString();
    }
}
