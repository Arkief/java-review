package FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> userList = new ArrayList<>();
        userList.add(User.builder().firstName("Mike").lastName("Smith").age(33).build());
        userList.add(User.builder().firstName("Carl").lastName("Empire").age(47).build());
        userList.add(User.builder().firstName("John").lastName("McKane").age(24).build());
        userList.add(User.builder().firstName("Sandra").lastName("Bullock").age(51).build());
        userList.add(User.builder().firstName("Jenny").lastName("Evans").age(18).build());
        userList.add(User.builder().firstName("Alan").lastName("Jackson").age(43).build());

        //Print all elements in the user list.
        printName(userList, p -> true);

        System.out.println("********************************************");

        //Print all users that last name starts with "E".
        printName(userList, user -> user.getLastName().startsWith("E"));

    }

    private static void printName(List<User> userList, Predicate<User> p){
        for(User user : userList){
            if (p.test(user)) System.out.println(user);
        }
    }


}
