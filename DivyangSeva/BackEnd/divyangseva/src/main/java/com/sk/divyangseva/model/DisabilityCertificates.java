package com.sk.divyangseva.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "disability_certificates")
public class DisabilityCertificates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "uid",referencedColumnName = "id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "docid",referencedColumnName = "id")
    private User docuser;
    @ManyToOne
    @JoinColumn(name = "pid",referencedColumnName = "id")
    private User policeuser;
    @ManyToOne
    @JoinColumn(name = "rid",referencedColumnName = "id")
    private User railwayuser;
    @ManyToOne
    @JoinColumn(name = "dtypeid",referencedColumnName = "id")
    private Disabilitytypes disabilitytypes;
    private Integer dpercentage;
    private String dproof;
    private Integer is_active;
    private Integer rail_concession_status;
    private Integer needs_escort;

}
