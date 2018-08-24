package com.demo.rest.pojo;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@XmlRootElement
@Component
@Entity
public class Employee{
		@Id
		private int EmployeeId;
		
		private String EmpName;
		
		
		public Employee() {
			
		}

	
		public Employee(int employeeId, String empName) {
			super();
			EmployeeId = employeeId;
			EmpName = empName;
		}

		public int getEmployeeId() {
			return EmployeeId;
		}
		public void setEmployeeId(int employeeId) {
			EmployeeId = employeeId;
		}
		public String getEmpName() {
			return EmpName;
		}
		public void setEmpName(String empName) {
			EmpName = empName;
		}
		@Override
		public String toString() {
			return "Employee [EmployeeId=" + EmployeeId + ", EmpName=" + EmpName + "]";
		}
	
}
