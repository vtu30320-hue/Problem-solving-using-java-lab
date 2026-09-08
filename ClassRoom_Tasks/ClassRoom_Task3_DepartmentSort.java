import java.util.Arrays;

public class ClassRoom_Task3_DepartmentSort {
    public static void main(String[] args) {

        String[] departments = {
            "CSE",
            "ECE",
            "MECH",
            "CIVIL",
            "AIML"
        };

        Arrays.stream(departments)
              .sorted()
              .forEach(System.out::println);
    }
}