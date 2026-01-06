import java.util.LinkedHashMap;
import java.util.Map;
import domain.User;

public class Main {
    public static void main(String[] args) {
        Map<String, User> users = new LinkedHashMap<>();
        users.put("joao@joao.com", new User("joao", 22));
        users.put("maria@maria.com", new User("Maria", 32));
        users.put("juca@juca.com", new User("Juca", 18));
        users.put("leo@leo.com", new User("Leo", 48));

        users.merge("leo@leo.com", new User("", -1), (user, user2) -> {
            System.out.println(user);
            System.out.println(user2);
            return user2;
        });
        System.out.println(users);
    }
}
