package com.sathya.restapiproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sathya.restapiproject.data.Employee;
import com.sathya.restapiproject.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	public Employee saveEmployeeData(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> saveEmployeesData(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

	public Optional<Employee> getEmployeeById(long id) {
	    return employeeRepository.findById(id);
	}
	
	public Optional<Employee> getEmployeeByEmail(String email) {
	    return employeeRepository.findByEmail(email);
	}

	public List<Employee> getEmployeeByDeptAndGender(String dept, String gender) {
		List<Employee> emp = employeeRepository.findByDeptAndGender(dept,gender);
		return emp;
	}

	public List<Employee> getEmployeeByDeptOrGender(String dept, String gender) {
		List<Employee> emp = employeeRepository.findByDeptOrGender(dept,gender);
		return emp;
	}

	public List<Employee> getEmpBySalaryBetween(int min, int max) {
		List<Employee> emp = employeeRepository.findBySalaryBetween(min,max);
		return emp;
	}

	public List<Employee> getEmpBySalaryGreaterThan(double salary) {
		List<Employee> emp = employeeRepository.findBySalaryGreaterThan(salary);
		return emp;
	}

	public List<Employee> getEmpBySalaryLessThan(double salary) {
		List<Employee> emp = employeeRepository.findBySalaryLessThan(salary);
		return emp;
	}

	


	

}