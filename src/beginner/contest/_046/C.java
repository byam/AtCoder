package beginner.contest._046;

import java.util.Scanner;

public class C {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long takahashi = 1;
        long aoki = 1;

        for(int i=0; i<n; i++){
            int t = scanner.nextInt();
            int a = scanner.nextInt();

            long tmp1 = takahashi/t;
            long tmp2 = aoki/a;

            tmp1 += (takahashi%t==0)?0:1;
            tmp2 += (aoki%a==0)?0:1;

            long tmp = Math.max(tmp1, tmp2);

            takahashi = t*tmp;
            aoki = a*tmp;
        }

        System.out.println(takahashi + aoki);
    }
}
