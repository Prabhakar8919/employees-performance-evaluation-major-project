package com.deltaorganisation;

public class customexception {
	public class EmployeeNotFoundException extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public EmployeeNotFoundException(String message) {
	        super(message);
	    }
	}

	public class DepartmentNotFoundException extends Exception {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public DepartmentNotFoundException(String message) {
	        super(message);
	    }
	}

}
