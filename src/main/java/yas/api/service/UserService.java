package main.java.yas.api.service;

import main.java.yas.entity.User;
import main.java.yas.manager.UserManager;
import main.java.yas.to.UserTO;

import javax.ejb.EJB;

/**
 * Created by Salman on 11/8/2015.
 */
public class UserService {

    /*@EJB
    private UserManager manager;*/

    public static String createNewUser_test(String name , UserManager manager) {
        //UserManager manager = new UserManager();
        return manager.createNewUser_test(name);
    }

    public static String readUser_test(UserManager manager) {
        UserTO to = manager.readUser_test();
        return to.getFirstName();
    }


}
