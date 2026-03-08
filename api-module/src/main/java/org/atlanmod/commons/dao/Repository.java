package org.atlanmod.commons.dao;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    Optional<T> findById(int id);
    List<T> findAll();
}

