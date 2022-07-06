package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        List<User> users = new ArrayList<>();
        users.add(new User("Leonid", "Romanov", (byte) 34));
        users.add(new User("Михаил", "Горбачев", (byte) 11));
        users.add(new User("Серафим", "Бадиков", (byte) 27));
        users.add(new User("Гурам", "Гевондян", (byte) 37));
        UserDaoJDBCImpl userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        users.forEach(u -> userDao.saveUser(u.getName(), u.getLastName(), u.getAge()));
        userDao.getAllUsers().forEach(System.out::println);
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
