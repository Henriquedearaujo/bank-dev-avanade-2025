package me.dio.service;

import me.dio.domain.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User create(User userToCreate);

    void delete(Long id);

    User update(Long id, User userToUpdate);


}
