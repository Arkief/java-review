import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@company.com", Arrays.asList("2022864710","2024847593")),
                new Employee(100,"Ozzy","ozzy@company.com", Arrays.asList("7031234567","7034567124")),
                new Employee(100,"Peter","peter@company.com", Arrays.asList("5162864710","5169870523"))
        );
    }
}
