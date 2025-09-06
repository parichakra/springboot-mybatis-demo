package com.parichakra.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.parichakra.mybatis.model.Employee;

@Mapper
public interface EmployeeMapper {
    List<Employee> findAll();
    Employee findById(Long id);
    void insert(Employee employee);
    void update(Employee employee);
    void delete(Long id);
    
    List<Employee> findAllPaged(
            @Param("offset") int offset,
            @Param("size") int size,
            @Param("sortColumn") String sortColumn,
            @Param("sortDirection") String sortDirection
        );
}
	