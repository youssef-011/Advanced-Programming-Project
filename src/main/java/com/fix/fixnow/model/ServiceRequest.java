package com.fix.fixnow.model;

import jakarta.persistence.*;

@Entity
@Table(name="service_requests")
//ServiceRequest = el order bta3 el service
public class ServiceRequest
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description; // description bta3 el problem
    private String status;// PENDING / IN_PROGRESS / DONE

    @ManyToOne
    @JoinColumn(name ="user_id")
    // kaza request le user wa7ed
    private User user;

    @ManyToOne
    @JoinColumn(name="technician_id")
    // kaza request le tech wa7ed
    private Technician technician;

    public ServiceRequest() {}

}
