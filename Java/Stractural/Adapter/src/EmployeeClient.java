import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
            public List<Employee> getEmployeeList() {

                List<Employee> employees = new ArrayList<>();
                Employee employeeFromDB = new EmployeeDb("1234", "Jhon", "Wick", "join@gmail.com");
                employees.add(employeeFromDB);

                Employee employeeFormLdap = new EmployeeDb("1234", "Jhon", "Wick", "join@gmail.com");

                return employees;
            }
}
