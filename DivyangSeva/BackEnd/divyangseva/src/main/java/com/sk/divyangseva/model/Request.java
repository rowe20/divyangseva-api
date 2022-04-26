package com.sk.divyangseva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    @JoinColumn(name = "uid", referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "doc_status_id", referencedColumnName = "id")
    private Status docstatus;
    @ManyToOne
    @JoinColumn(name = "p_status_id", referencedColumnName = "id")
    private Status policestatus;
    @ManyToOne
    @JoinColumn(name = "r_status_id", referencedColumnName = "id")
    private Status railwayofficerstatus;
}
