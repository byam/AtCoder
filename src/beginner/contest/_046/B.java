package beginner.contest._046;

import java.util.Scanner;

public class B {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.println((int)(k * Math.pow(k-1, n-1)));
    }
}
