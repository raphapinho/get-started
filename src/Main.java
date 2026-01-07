import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static domain.Sex.FEMALE;
import static domain.Sex.MALE;
import static domain.ContactType.EMAIL;
import static domain.ContactType.PHONE;
import domain.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(generateUsers());

        var values = users.stream().filter(u -> u.sex() == FEMALE)
                        .collect(Collectors.toMap(User::name, user ->user));

        values.forEach((key,value) -> System.out.printf("key: %s | value: %s \n", key, value));
    }

    private static List<User> generateUsers() {
        var contact1 = List.of(
                new Contact("(19)94654949", PHONE),
                new Contact("joao@gmail.com", EMAIL));
        var contact2 = List.of(
                new Contact("9999999999", PHONE));
        var contact3 = List.of(
                new Contact("lucas#outlook.com", EMAIL));
        var contact4 = List.of(
                new Contact("andreia@outook.com", EMAIL),
                new Contact("andreia@gmail.com", EMAIL));
        var contact5 = List.of(
                new Contact("7777777777", PHONE),
                new Contact("7849498849498", PHONE)

        );

        var user1 = new User("João", 26, MALE, new ArrayList<>(contact1));
        var user2 = new User("Maria", 28, FEMALE, new ArrayList<>(contact2));
        var user3 = new User("Lucas", 19, MALE, new ArrayList<>(contact3));
        var user4 = new User("Andreia", 40, FEMALE, new ArrayList<>(contact4));
        var user5 = new User("Vitor", 30, MALE, new ArrayList<>(contact5));
        var user6 = new User("Bruna", 36, FEMALE, new ArrayList<>());

        return List.of(user1, user2, user3, user4, user5, user6);
    }
}
