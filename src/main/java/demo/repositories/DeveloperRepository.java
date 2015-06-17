package demo.repositories;

import demo.model.Developer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
public interface DeveloperRepository extends PagingAndSortingRepository<Developer, Long> {

    List<Developer> findBySurname(@Param("surname")String surename);
    List<Developer> findByNameAndSurname(@Param("name") String name, @Param("surname") String surname);
    List<Developer> findByDateIncorporationBetween(@Param("start") Date start, @Param("end") Date end );
}
