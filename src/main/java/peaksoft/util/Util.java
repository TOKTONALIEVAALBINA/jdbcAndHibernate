package peaksoft.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String User_name = "postgres";
    private static final String Password = "123";

    public static Connection connection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, User_name, Password);
            System.out.println("connection to the postgresql successfully ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    private static SessionFactory buildSessionFactory() {

        SessionFactory sessionFactory = null;
        try{
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(User.class)
                    .buildSessionFactory();
            System.out.println("The table successfully created");
        }catch (Exception e){
            e.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSession(){
        return buildSessionFactory();
    }
}