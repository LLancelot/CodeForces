package _231A_Team;

import java.util.Scanner;

// greedy
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        while (--N >= 0) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            if (A + B + C >= 2) {
                count++;
            }
        }
        System.out.println(count);
    }

}
