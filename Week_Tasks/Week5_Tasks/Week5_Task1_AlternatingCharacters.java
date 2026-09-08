import java.util.*;

public class Week5_Task1_AlternatingCharacters {

    public static int Week5_Task1_AlternatingCharacters(String s) {

        int deletions = 0;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == s.charAt(i - 1)) {
                deletions++;
            }
        }

        return deletions;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {

            String s = sc.next();

            int result = Week5_Task1_AlternatingCharacters(s);

            System.out.println(result);
        }

        sc.close();
    }
}