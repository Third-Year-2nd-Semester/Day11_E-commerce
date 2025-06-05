package vau.ac.lk.ict.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import vau.ac.lk.ict.model.Employee;
import vau.ac.lk.ict.repo.EmployeeRepo;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo repo;
	
	public List<Employee>searchSalary(int s,int e) {
		if(repo.findSalaryRange(s, e).isEmpty()) {
			throw new EntityNotFoundException("Employee Not Found");
		}
		return repo.findSalaryRange(s, e);
	}

}

