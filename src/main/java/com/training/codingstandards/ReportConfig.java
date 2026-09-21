package com.training.codingstandards;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReportConfig {

    public static List<Employee> CACHE = new ArrayList<Employee>();

    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String OUTPUT_SHEET = "Payroll";
    public static String OUTPUT_SHEET_2 = "Payroll";

    public static final String DEFAULT_PASSWORD = "P@ssw0rd!";
}
