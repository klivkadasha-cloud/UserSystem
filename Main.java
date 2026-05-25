import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();

        while (true) {
            System.out.println("\nChoose user type: admin / regular / exit");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(sc.nextLine());

            if (type.equalsIgnoreCase("admin")) {
                System.out.print("Enter role: ");
                String role = sc.nextLine();

                users.add(new Admin(name, age, role));

            } else if (type.equalsIgnoreCase("regular")) {

                users.add(new RegularUser(name, age));

            } else {
                System.out.println("Unknown type!");
            }

            System.out.println("User added!");
        }

        // SEARCH
        System.out.print("\nEnter name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (User u : users) {
            if (u.getName().equalsIgnoreCase(searchName)) {
                System.out.println("\nUser found:");
                u.showInfo();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("User not found in database");
        }

        // OUTPUT ALL USERS
        System.out.println("\nAll users:");
        for (User u : users) {
            u.showInfo();
        }

        sc.close();
    }
}
