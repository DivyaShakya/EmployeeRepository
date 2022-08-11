package com.springdemo.employee.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class employeemaster {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="employeeid")
	private Long id;

	@Column(
			name="employeename",
			length = 10,
			nullable = false,
			unique = true)
	private String employeename;

	@Column(
			name="employeecode",
			length = 60,
			nullable = false,
			unique = true)
	private String employeecode;

	@Column(
			name="employeeaddress",
			length = 250,
			nullable = false)
	private String employeeaddress;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public String getEmployeecode() {
		return employeecode;
	}

	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}

	public String getEmployeeaddress() {
		return employeeaddress;
	}

	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}

	@Override
	public String toString() {
		return "employeemaster [id=" + id + ", employeename=" + employeename + ", employeecode=" + employeecode
				+ ", employeeaddress=" + employeeaddress + "]";
	}

	
	
	
}

