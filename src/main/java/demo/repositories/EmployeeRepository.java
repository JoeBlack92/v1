package demo.repositories;

import demo.model.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
public interface EmployeeRepository extends PagingAndSortingRepository <Employee, Long> {

    List<Employee> findBySurname(@Param("surname")String surename);
    List<Employee> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    List<Employee> findByDateIncorporationBetween(@Param("start") Date start, @Param("end") Date end );

}
