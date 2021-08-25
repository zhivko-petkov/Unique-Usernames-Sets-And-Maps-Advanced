package EXERCISES;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashSet<String> usernames = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String info = sc.nextLine();
            usernames.add(info);
        }

        for (var a: usernames) {
            System.out.println(a);
        }
    }
}
