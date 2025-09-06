package com.parichakra.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parichakra.mybatis.mapper.EmployeeMapper;
import com.parichakra.mybatis.model.Employee;

@Service
public class EmployeeService {
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public List<Employee> getAll() {
        return employeeMapper.findAll();
    }

    public Employee getById(Long id) {
        return employeeMapper.findById(id);
    }

    public void create(Employee employee) {
        employeeMapper.insert(employee);
    }

    public void update(Employee employee) {
        employeeMapper.update(employee);
    }
    
    public List<Employee> getAllPaged(int page, int size, String sort) {
        int offset = page * size;

        // Default sort
        String sortColumn = "id";
        String sortDirection = "asc";

        if (sort != null && sort.contains(",")) {
            String[] parts = sort.split(",");
            sortColumn = parts[0];
            sortDirection = parts[1];
        }

        // Whitelist allowed columns
        if (!List.of("id", "name", "role", "salary").contains(sortColumn)) {
            sortColumn = "id";
        }

        if (!sortDirection.equalsIgnoreCase("asc") && !sortDirection.equalsIgnoreCase("desc")) {
            sortDirection = "asc";
        }

        return employeeMapper.findAllPaged(offset, size, sortColumn, sortDirection);
    }

    public void delete(Long id) {
        employeeMapper.delete(id);
    }
}
