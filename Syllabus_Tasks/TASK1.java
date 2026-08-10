import java.util.*;
import java.util.stream.Collectors;

public class TASK1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of employees
        List<Integer> salaries = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            salaries.add(sc.nextInt());
        }

        // Functional transformation: increase each salary by 10%
        List<Integer> updatedSalaries = salaries.stream()
                                                .map(s -> (int)(s * 1.1))
                                                .collect(Collectors.toList());

        // Print updated salaries space-separated
        System.out.println(
            updatedSalaries.stream()
                           .map(String::valueOf)
                           .collect(Collectors.joining(" "))
        );
    }
}
