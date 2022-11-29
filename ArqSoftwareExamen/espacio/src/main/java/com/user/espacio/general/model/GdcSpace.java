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
@Table(name = "GDC_SPACE")
@Data
@NoArgsConstructor
public class GdcSpace {
    @Id 
    @EqualsAndHashCode.Include
    @Column(name = "COD_SPACE", nullable = false)
    private Integer cod_space; 

    @Column(name = "NAME", length = 128, nullable = false)
    private String name; 

    @Column(name = "DESCRIPTION", length = 500, nullable = false)
    private String description; 

    @Temporal(TemporalType.DATE)
    @Column(name = "CREATION_DATE", nullable = false)
    private Date creation_date; 

    @Column(name = "VISIBILITY", length = 3, nullable = false)
    private String visibility; 

}
    