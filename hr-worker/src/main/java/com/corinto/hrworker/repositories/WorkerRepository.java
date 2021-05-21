package com.corinto.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}