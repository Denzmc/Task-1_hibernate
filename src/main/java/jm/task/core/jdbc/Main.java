package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import org.hibernate.context.spi.CurrentSessionContext;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl service = new UserServiceImpl();
//        service.saveUser("Denis", "Zagirov", (byte) 36);
//        service.createUsersTable();
        service.dropUsersTable();
//        System.out.println(service.getAllUsers());
//        service.removeUserById(1);
    }
}
