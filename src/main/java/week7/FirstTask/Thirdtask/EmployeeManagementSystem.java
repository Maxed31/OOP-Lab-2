package week7.FirstTask.Thirdtask;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagementSystem {
    public static List<Employee> filterEmployeeBySalary(List<Employee> employees,double min){
        return employees.stream().
                filter(emp -> emp.salary() >= min).collect(Collectors.toList());
    }
    public static double calculateTotalSalary(List<Employee> employees){
        double total = 0;
        for (Employee emp : employees){
            total += emp.salary();
        }
        return total;
    }
    public static void displayEmployeeData(List<Employee> employees){
        for(Employee emp : employees){
            System.out.println(emp);
        }
    }
}
