package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Leonid", "Romanov", (byte) 34);
        userService.saveUser("Михаил", "Горбачев", (byte) 11);
        userService.saveUser("Серафим", "Бадиков", (byte) 27);
        userService.saveUser("Гурам", "Гевондян", (byte) 37);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
