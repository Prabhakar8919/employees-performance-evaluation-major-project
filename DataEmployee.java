package com.deltaorganisation;

import java.util.Date;

public class DataEmployee implements Employee {
    int employeeId;
    String name;
    String panNo;
    String status;
    String designation;
    Date dateOfJoining;
    Date dateOfBirth;
    String mobNo;
    String email;
    int deptId;
    
    @Override
    public String getEmployeeStatus() {
        return status;
    }

    // Constructors, getters, setters, and other methods
}
