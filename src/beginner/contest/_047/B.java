package beginner.contest._047;

import java.util.Scanner;

public class B {
    private static int W, H, N;
    private static int x1 = 0, y1 = 0, x2, y2;
    private static int[] x, y, a;
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args){
        input();
        solve();
    }

    private static void solve() {
        for (int i = 0; i < N; i++) {
                update_xy(x[i], y[i], a[i]);
        }

        if (x2 > x1 && y2 > y1)
            System.out.println((x2-x1)*(y2-y1));
        else
            System.out.println(0);
    }

    private static void update_xy(int xi, int yi, int ai) {
        switch(ai){
            case 1:
                x1 = Math.max(x1, xi);
                break;
            case 2:
                x2 = Math.min(x2, xi);
                break;
            case 3:
                y1 = Math.max(y1, yi);
                break;
            case 4:
                y2 = Math.min(y2, yi);
                break;
        }
    }

    private static void input() {
        W = scanner.nextInt();
        H = scanner.nextInt();
        N = scanner.nextInt();

        x2 = W;
        y2 = H;

        x = new int[N];
        y = new int[N];
        a = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
            a[i] = scanner.nextInt();
        }
    }

    private static void test_input() {
        W = 5;
        H = 4;
        N = 2;

        x2 = W;
        y2 = H;

        x = new int[]{2, 3};
        y = new int[]{1, 3};
        a = new int[]{1, 4};

    }
}
