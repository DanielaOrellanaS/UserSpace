package com.user.espacio.general.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "SEG_USER")
@Data
@NoArgsConstructor
public class SegUser {
    @Id 
    @EqualsAndHashCode.Include
    @Column(name = "COD_USER", nullable = false)
    private Integer cod_user; 

    @Column(name = "USERNAME", length = 32, nullable = false)
    private String username; 

    @Column(name = "NAME", length = 128, nullable = false)
    private String name; 

    @Column(name = "EMAIL", length = 128, nullable = false)
    private String email; 

    @Column(name = "STATUS", length = 3, nullable = false)
    private String status; 

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creation_date; 
}
