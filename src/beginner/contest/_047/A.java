package beginner.contest._047;

import java.util.Scanner;

public class A {
    private static int a,b,c;

    public static void main(String[] args){
        input();
        solve();
    }

    private static void solve() {
        if (a + b == c || a + c == b || b + c == a)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }
}
