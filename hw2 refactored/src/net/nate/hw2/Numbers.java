package net.nate.hw2;

public class Numbers {
    public static void main(String[] args) {
        int sum = 0;
        int x = 5;
        while (x <= 500) {
            sum += x;
            x += 5;
        }
        System.out.println(sum);
    }
}
