package com.fix.fixnow.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "technicians")
//Technician = b yshtghl or b enfz requests w yakhod ratings
public class Technician {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id; // primary key
    private  String name;
    private  String skill; // zay plumbing / electric

    private  double rating;
    @OneToMany(mappedBy = "technician")    // tech wa7ed yshof kaza request
    private List<ServiceRequest> requests;

    @OneToMany(mappedBy = "technician")    // tech leeh kaza review
    private List<Review> reviews;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Technician(){

}


}
