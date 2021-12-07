package chyngyz.sharshekeev.securityservice.service;

import chyngyz.sharshekeev.securityservice.domain.Role;
import chyngyz.sharshekeev.securityservice.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
