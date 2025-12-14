 import java.util.LinkedHashSet;

public class RecentLoginUsers {

    public static void main(String[] args) {

        LinkedHashSet<String> recentUsers = new LinkedHashSet<>();

        login(recentUsers, "Amit");
        login(recentUsers, "Ravi");
        login(recentUsers, "Neha");
        login(recentUsers, "Amit");   // duplicate login
        login(recentUsers, "Sonal");
        login(recentUsers, "Ravi");   // duplicate login

        System.out.println("\nFinal Recent Login Order:");
        for (String user : recentUsers) {
            System.out.println(user);
        }
    }

    // Advanced logic method
    public static void login(LinkedHashSet<String> set, String user) {

        // Agar user already exist karta hai
        if (set.contains(user)) {
            set.remove(user); // old position remove
        }

        // Latest login add
        set.add(user);

        System.out.println("After login: " + user + " -> " + set);
    }
}
