package beginner.contest._047;

import java.util.Scanner;

public class C {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String board = scanner.next();
        int stop = 0;
        char last = board.charAt(0);
        for (int i = 0; i < board.length(); i++) {
            if (last != board.charAt(i)){
                stop ++;
                last = board.charAt(i);
            }
        }

        System.out.println(stop);
    }
}
