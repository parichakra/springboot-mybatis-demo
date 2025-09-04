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

    public void delete(Long id) {
        employeeMapper.delete(id);
    }
}
