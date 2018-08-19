package system.repositories;

import system.model.User;

import java.util.List;

public interface UserRepo {
    /* CRUD options*/
    void addUser(User user);
    User loadUserById(String id);
    List<User> loadAllUser();
    void updateUser(User user);
    void deleteUserById(String id);
}
