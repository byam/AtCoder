package beginner.contest._046;

import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[101];

        int count = 0;

        for (int i = 0; i < 3; i++) {

            int n = scanner.nextInt();

            if (arr[n] == 0){
                count ++;
                arr[n] = 1;
            }
        }

        System.out.println(count);

    }
}
