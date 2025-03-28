package com.bridgelabz.mapInterface;
import java.util.*;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupEmployeesByDepartment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        // Input employees
        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter department:");
            String department = sc.nextLine();
            employees.add(new Employee(name, department));
        }

        // Group by department
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee emp : employees) {
            departmentMap.computeIfAbsent(emp.department, k -> new ArrayList<>()).add(emp);
        }


        for (Map.Entry<String, List<Employee>> entry : departmentMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

/*
Enter number of employees:
4
Enter employee name:
Sehaj
Enter department:
IT
Enter employee name:
Bhawishya
Enter department:
CC
Enter employee name:
Sanya
Enter department:
HR
Enter employee name:
Sehajpreet
Enter department:
IT
CC: [Bhawishya]
HR: [Sanya]
IT: [Sehaj, Sehajpreet]

 */