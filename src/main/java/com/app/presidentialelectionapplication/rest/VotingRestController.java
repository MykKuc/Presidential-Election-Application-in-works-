package com.app.presidentialelectionapplication.rest;


import com.app.presidentialelectionapplication.entity.Voter;
import com.app.presidentialelectionapplication.service.VotingService;
import com.app.presidentialelectionapplication.service.VotingServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VotingRestController {

    public VotingServiceImplementation votingServiceImplementation;
    @Autowired
    public VotingRestController(VotingServiceImplementation theVotingServiceImplementation){
        votingServiceImplementation=theVotingServiceImplementation;}

    @PutMapping("/vote")
    public Voter updateVoter(@RequestBody Voter theVoter){
        votingServiceImplementation.save(theVoter);
        return theVoter;
    }
}
