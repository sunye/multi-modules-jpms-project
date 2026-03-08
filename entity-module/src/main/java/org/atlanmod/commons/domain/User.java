package org.atlanmod.commons.domain;

import org.jspecify.annotations.NonNull;

public class User {
    @NonNull
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
