package peaksoft;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.dialect.function.ConvertFunction;
import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.dao.UserDaoJdbcImpl;
import peaksoft.model.User;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
          userDaoHibernate.createUsersTable();
        // userDaoHibernate.cleanUsersTable();
//        userDaoHibernate.saveUser("Alina","Toktonalieva",(byte) 34);
//        userDaoHibernate.saveUser("Marina","Pak",(byte) 11);
//        userDaoHibernate.saveUser("Nina","Valueva",(byte) 54);
//        userDaoHibernate.saveUser("Nona","Kim",(byte) 20);
        //   userDaoHibernate.removeUserById(3L);
//       List<User> userList = userDaoHibernate.getAllUsers();
//       for(User user : userList){
//           System.out.println(user);
//       }

    //    userDaoHibernate.dropUsersTable();
    }
}

