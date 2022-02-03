package com.app.presidentialelectionapplication.service;

import com.app.presidentialelectionapplication.dao.VoterRepository;
import com.app.presidentialelectionapplication.entity.Voter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class VotingServiceImplementation implements VotingService {

    public VoterRepository voterRepository;

    @Autowired
    public VotingServiceImplementation(VoterRepository theVoterRepository)
    {voterRepository = theVoterRepository;}

    Voter voter = new Voter();

    @Override
    public void save(Voter theVoter) {
       
        if (voter.vote != null){
            System.out.println("You can not change your vote.");
        }else {
            voterRepository.save(theVoter);
        }

    }
}
