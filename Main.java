
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    private static final String Interger = null;

    public static void main(String args[]) {

        int check = 0;

        String input = "[10,9,8,7] * [2,4,6,8]";
        String[] splited;
        String s1, s2;
        String[] as1, as2;
        ArrayList<Integer> numA, numB;
        if (input.contains("+")) {
            check = 1;
            splited = input.split(" [+] ");
        } else if (input.contains("*")) {
            check = 2;
            splited = input.split(" [*] ");
        } else if (input.contains("-")) {
            check = 3;
            splited = input.split(" [-] ");
        } else {
            System.out.println("Error!");
            return;
        }
        s1 = splited[0].substring(1, splited[0].lastIndexOf("]"));
        s2 = splited[1].substring(1, splited[1].lastIndexOf("]"));

        System.out.println(input);
        as1 = s1.split(",");
        as2 = s2.split(",");
        numA = new ArrayList<Integer>();
        numB = new ArrayList<Integer>();
        for (String ad : as1) {
            numA.add(Integer.parseInt(ad.trim()));
        }

        for (String ad : as2) {
            numB.add(Integer.parseInt(ad.trim()));
        }

        Set<Integer> union = new HashSet<Integer>(numA);
        union.addAll(numB);

        Set<Integer> inter = new HashSet<Integer>(numA);
        inter.retainAll(numB);

        Set<Integer> diff = new HashSet<Integer>(numA);
        diff.removeAll(numB);

        if (check == 1) {
            System.out.println(union);
        } else if (check == 2) {
            System.out.println(inter);
        } else if (check == 3) {
            System.out.println(diff);
        } else {
            System.out.println("Error!!");
        }

    }
}
