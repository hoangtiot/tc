package com.tutorcenter.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "tblRequestVerification")
public class RequestVerification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "tutorID")
    private Tutor tutor;
    @ManyToOne
    @JoinColumn(name = "managerID")
    private Manager manager;
    @Column
    private String status;
    @Column
    private String rejectReason;
    @Column
    private Date dateModified;
}
