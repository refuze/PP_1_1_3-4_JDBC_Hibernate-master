package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Egor", "Sovel'ev", (byte) 19);
        System.out.println("User с именем – Egor добавлен в базу данных");
        userService.saveUser("Vlad", "Morozov", (byte) 25);
        System.out.println("User с именем – Vlad добавлен в базу данных");
        userService.saveUser("Masha", "Pestushkina", (byte) 32);
        System.out.println("User с именем – Masha добавлен в базу данных");
        userService.saveUser("Nikita", "Golovin", (byte) 17);
        System.out.println("User с именем – Nikita добавлен в базу данных");
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
