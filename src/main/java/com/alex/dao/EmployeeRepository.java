package com.alex.dao;

import com.alex.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    /**
     * 查询雇员信息
     *
     * @param id
     * @return
     */
    Employee queryEmployeeById(String id);
}


