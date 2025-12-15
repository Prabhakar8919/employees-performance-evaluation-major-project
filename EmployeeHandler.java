package com.deltaorganisation;

import java.util.ArrayList;

public class EmployeeHandler {
	 private ArrayList<DataEmployee> employees;
	    private ArrayList<Department> departments;

	    public EmployeeHandler() {
	        setEmployees(new ArrayList<>());
	        setDepartments(new ArrayList<>());
	    }

		public ArrayList<Department> getDepartments() {
			return departments;
		}

		public void setDepartments(ArrayList<Department> departments) {
			this.departments = departments;
		}

		public ArrayList<DataEmployee> getEmployees() {
			return employees;
		}

		public void setEmployees(ArrayList<DataEmployee> employees) {
			this.employees = employees;
		}
}
