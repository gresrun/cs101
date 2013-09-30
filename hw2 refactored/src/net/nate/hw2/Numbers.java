package net.nate.hw2;

public class Numbers {
    public static void main(String[] args) {
        int x = 5;
        int y = x + 5;
        int i = 0;
        for (i = 0; i <= 100; i++) {
            x = x + y;
            if (i == 100) {
                System.out.println(x);
            }
        }
    }
}
