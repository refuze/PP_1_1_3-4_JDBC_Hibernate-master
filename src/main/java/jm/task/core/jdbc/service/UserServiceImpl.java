package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private static final UserDaoJDBCImpl userJDBC = new UserDaoJDBCImpl();
    private static final UserDaoHibernateImpl userHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
//        userDaoJDBC.createUsersTable();
        userHibernate.createUsersTable();
    }

    public void dropUsersTable() {
//        userJDBC.dropUsersTable();
        userHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
//        userJDBC.saveUser(name, lastName, age);
        userHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
//        userJDBC.removeUserById(id);
        userHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
//        return userJDBC.getAllUsers();
        return userHibernate.getAllUsers();
    }

    public void cleanUsersTable() {
//        userJDBC.cleanUsersTable();
        userHibernate.cleanUsersTable();
    }
}
