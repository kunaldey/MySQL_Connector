package com.aafes.mysql.repository;

import com.aafes.mysql.model.Execution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExecutionRepo extends JpaRepository<Execution, Integer> {
    @Query(value = "SELECT * FROM execution WHERE cycle=?1", nativeQuery = true)
    List<Object[]> findByCycle(String cycleID);
    @Query(value = "SELECT * FROM execution WHERE cycle=?1 AND end_of_test=?2", nativeQuery = true)
    List<Execution> findTestByCycle(String cycle, String endOFTest);
}
