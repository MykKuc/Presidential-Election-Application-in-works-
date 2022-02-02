package com.app.presidentialelectionapplication.entity;

import javax.persistence.*;

@Entity
@Table(name="voters")
public class Voter {
    @Id
    @GeneratedValue
    @Column(name="id",updatable = false)
    private int id;
    @Column(name="region",updatable = false)
    private String region;
    @Column(name="vote")
    public String vote;

    public Voter(){}

    public Voter(String region, String vote) {
        this.region = region;
        this.vote = vote;
    }

    public int getId() {
        return id;
    }

    public String getRegion() {
        return region;
    }

    public String getVote() {
        return vote;
    }

    public void setVote(String vote) {
        this.vote = vote;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "id=" + id +
                ", region='" + region + '\'' +
                ", vote='" + vote + '\'' +
                '}';
    }
}
