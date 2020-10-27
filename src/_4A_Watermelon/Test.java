package _4A_Watermelon;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 3)
            System.out.println("NO");
        else if (n % 2 == 1)
            System.out.println("NO");
        else
            System.out.println("YES");

    }
}
