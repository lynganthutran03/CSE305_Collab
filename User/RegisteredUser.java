package User;

import java.util.*;

public class RegisteredUser {

    private List<User> listOfUsers;

    public RegisteredUser() {
        listOfUsers = new ArrayList<>();
    }

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void removeUser(User user) {
        listOfUsers.remove(user);
    }

    public List<User> getListOfUsers() {
        return listOfUsers;
    }
}
