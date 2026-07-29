import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class syllabus_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        // Functional transformation: increase each salary by 10%
        List<Integer> updatedSalaries = salaries.stream()
                                                .map(s -> (int)(s * 1.1))
                                                .collect(Collectors.toList());

        // Print updated salaries space-separated without trailing space
        System.out.println(
            updatedSalaries.stream()
                           .map(String::valueOf)
                           .collect(Collectors.joining(" "))
        );
    }
}
