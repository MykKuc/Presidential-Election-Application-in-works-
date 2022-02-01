package com.app.presidentialelectionapplication.dao;

import com.app.presidentialelectionapplication.entity.Voter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoterRepository extends JpaRepository<Voter,Integer> {

}
