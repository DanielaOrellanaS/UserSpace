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
@Table(name = "GDC_SPACE_HISTORY")
@Data
@NoArgsConstructor
public class GdcSpaceHistory {
    @Id 
    @EqualsAndHashCode.Include
    @Column(name = "COD_SPACE_HISTORY", nullable = false)
    private Integer cod_space_history; 

    @Column(name = "COD_SPACE", nullable = false)
    private Integer cod_space; 

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_SPACE", nullable = false)
    private Date date_space; 

    @Column(name = "ACTION", length = 8, nullable = false)
    private String action; 

    @Temporal(TemporalType.DATE)
    @Column(name = "USERNAME", length = 32, nullable = false)
    private Date username; 

    @Column(name = "DESCRIPTION", length = 128, nullable = false)
    private String description; 
}
