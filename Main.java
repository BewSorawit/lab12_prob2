import java.util.*;

public class Main {
    public static void main(String[] args) {
        String input = "[ 5, 10, 15, 20 ] - [ 0, 10, 20 ]";
        String[] split;
        String[] s1, s2;
        int check;
        if (input.contains("+")) {
            split = input.split("\\+");
            check = 1;
        } else if (input.contains("*")) {
            split = input.split("\\*");
            check = 2;
        } else if (input.contains("-")) {
            split = input.split("\\-");
            check = 3;
        } else {
            return;
        }

        s1 = split[0].split(",");
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < s1.length; i++) {
            a.add(Integer.parseInt(s1[i].replaceAll("[^0-9]", "")));
        }

        s2 = split[1].split(",");
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < s2.length; i++) {
            b.add(Integer.parseInt(s2[i].replaceAll("[^0-9]", "")));
        }

        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(a);
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(b);

        if (check == 1) {
            Set<Integer> union = new HashSet<Integer>(a);
            union.addAll(b);
            System.out.print("Union of the two Set ");
            System.out.println(union);
        } else if (check == 2) {
            Set<Integer> intersection = new HashSet<Integer>(a);
            intersection.retainAll(b);
            System.out.print("Intersection of the two Set ");
            System.out.println(intersection);
        } else if (check == 3) {
            Set<Integer> difference = new HashSet<Integer>(a);
            difference.removeAll(b);
            System.out.print("Difference of the two Set ");
            System.out.println(difference);
        }

    }
}