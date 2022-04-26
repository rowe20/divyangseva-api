package com.sk.divyangseva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "railway_job_queue")
public class RailwayJobQueue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "req_id",referencedColumnName = "id")
    private Request request;
    @ManyToOne
    @JoinColumn(name = "rid",referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "job_status",referencedColumnName = "id")
    private Status status;

}
