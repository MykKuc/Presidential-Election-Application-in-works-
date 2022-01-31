package com.app.presidentialelectionapplication.entity;


import javax.persistence.*;

@Entity
@Table(name="candidates")
public class Candidate {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="list_number")
    private int listNumber;
    @Column(name="full_name")
    private int fullName;
    @Column(name="agenda")
    private int agenda;

    public Candidate(){}

    public Candidate(int fullName, int agenda) {
        this.fullName = fullName;
        this.agenda = agenda;
    }
    //Create getter/setter methods.

    public int getListNumber() {
        return listNumber;
    }

    public int getFullName() {
        return fullName;
    }

    public int getAgenda() {
        return agenda;
    }

    //Create toString()


    @Override
    public String toString() {
        return "Candidate{" +
                "listNumber=" + listNumber +
                ", fullName=" + fullName +
                ", agenda=" + agenda +
                '}';
    }
}
