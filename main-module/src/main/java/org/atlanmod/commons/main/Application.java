package org.atlanmod.commons.main;

import org.atlanmod.commons.dao.Repository;
import org.atlanmod.commons.domain.User;
import org.atlanmod.commons.userdao.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();
        users.put(1, new User("Julie"));
        users.put(2, new User("David"));
        Repository userDao = new UserRepository(users);
        userDao.findAll().forEach(System.out::println);
    }
}