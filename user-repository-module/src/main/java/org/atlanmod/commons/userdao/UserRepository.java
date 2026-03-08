package org.atlanmod.commons.userdao;

import org.atlanmod.commons.dao.Repository;
import org.atlanmod.commons.domain.User;

import java.util.*;

public class UserRepository implements Repository<User> {
    private final Map<Integer, User> users = new HashMap<>();

    public UserRepository() {
    }

    public UserRepository(Map<Integer, User> newUsers) {
        for (Map.Entry<Integer, User> each: newUsers.entrySet()) {
            this.users.put(each.getKey(), each.getValue());
        }
    }

    // standard constructor

    @Override
    public Optional<User> findById(int id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }
}