package strings;

import java.util.*;

public class StringFormatterReversedScan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Input string to be reversed
        System.out.println("Input string to be reversed");
        String name = in.nextLine();
        System.out.println(StringFormatter.reverseString(name));
        in.close();
    }
}
/*
 * System.out.println(StringFormatter.reverseString("I am jefferson"));
 * System.out.println(StringFormatter.
 * reverseString("Hi jefferson, hi lorena, my name is larissa"));
 */
