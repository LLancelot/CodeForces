package _1413D_Shurikens;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> op = new ArrayList<>(2*n);
        ArrayList<Integer> st = new ArrayList<>();

        for (int i = 0; i < 2 * n; i++) {
            String s;
            s = sc.next();
            if (s.equals("+"))
                st.add(i);
            else {
                if (st.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                op.set(i, sc.nextInt());
                op.set(st.get(st.get(st.size() - 1)), -op.get(i));
                st.remove(st.size()-1);
            }
        }
        TreeSet<Integer> s = new TreeSet<>();
        for (int i = 0; i < 2 * n; i++) {
            if (op.get(i) < 0)
                s.add(-op.get(i));
            else {
                if (s.isEmpty() || !s.first().equals(op.get(i))) {
                    System.out.println("NO");
                    return;
                }
                s.remove(s.first());
            }
        }
        System.out.println("YES");
        for (int i = 0; i < 2 * n; i++) {
            if (op.get(i) < 0)
                System.out.println(-op.get(i));
        }
        return;
    }
}
