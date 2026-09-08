import java.util.Arrays;

public class ClassRoom_Task8_SalarySort {
    public static void main(String[] args) {

        int[] salary = {50000, 25000, 75000, 40000, 60000};

        Arrays.stream(salary)
              .sorted()
              .forEach(s -> System.out.print(s + " "));
    }
}