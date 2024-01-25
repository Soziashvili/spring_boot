package web.boot.service;

import web.boot.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> listUsers();

    User findUserById(int id);

    void deleteUser(int id);

    void updateUser(int id, User user);
}
