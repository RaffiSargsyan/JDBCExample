package jdbcexample;

import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();


        try {
           // User user = new User("Messi", "Leonel", "leomessi@gmail.com", "barca777");

           // userManager.addUser(user);

           // System.out.println(user);

            List<User> alluser = userManager.getAllUsers();
            for (User user : alluser) {
                System.out.println(user);

            }
            userManager.deleteUserById(1);
            System.out.println();
            alluser = userManager.getAllUsers();
            for (User user : alluser) {
                System.out.println(user);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
