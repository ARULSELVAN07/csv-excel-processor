package com.training.codingstandards;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseHelper {

    private static final String URL = "jdbc:mysql://localhost:3306/hr";
    private static final String USER = "hr_admin";
    private static final String PASSWORD = "Admin@12345";

    public Employee findEmployee(String empId) {
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();
            String sql = "SELECT * FROM employees WHERE emp_id = '" + empId + "'";
            System.out.println("Running query: " + sql);
            rs = statement.executeQuery(sql);
            if (rs.next()) {
                Employee employee = new Employee();
                employee.empId = rs.getString("emp_id");
                employee.name = rs.getString("name");
                return employee;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void auditExport(String userInputPath) {
        try {
            Runtime.getRuntime().exec("cmd.exe /c dir " + userInputPath);
        } catch (Exception e) {
        }
    }
}
