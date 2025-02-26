package com.karan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karan.model.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, String> {

}
