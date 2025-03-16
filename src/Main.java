

        import com.usermanagement.user.User;
        import com.iteminventory.item.Item;

        import java.util.ArrayList;
        import java.util.List;

        public class Main {
        public static void main(String[] args) {
        // User Management
        User user1 = new User("Baker", "Baker@gmail.com");
        User user2 = new User("James", "James@gmail.com");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        System.out.println("User Information:");
        for (User user : users) {
        System.out.println(user);
        }

        // Item Management
        Item item1 = new Item("Desktop", 1200.00);
        Item item2 = new Item("Mouse", 25.00);

        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        System.out.println("\nAvailable Items:");
        for (Item item : items) {
        System.out.println(item);
        }
        }
        }