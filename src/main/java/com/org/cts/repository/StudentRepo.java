package com.org.cts.repository;

import com.org.cts.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    @Transactional
    List<Student> findByAddress(String address);

}
