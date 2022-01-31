package com.app.presidentialelectionapplication.dao;

import com.app.presidentialelectionapplication.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<Candidate,Integer> {

}
