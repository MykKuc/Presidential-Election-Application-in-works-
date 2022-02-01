package com.app.presidentialelectionapplication.rest;


import com.app.presidentialelectionapplication.dao.CandidateRepository;
import com.app.presidentialelectionapplication.entity.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ShowCandidateRestController {



    private CandidateRepository candidateRepository;

    @Autowired
    public ShowCandidateRestController (CandidateRepository theCandidateRepository)
    { candidateRepository=theCandidateRepository; }


    @GetMapping("/candidates")
    public List<Candidate> findAll(){
        return candidateRepository.findAll();
    }


}
