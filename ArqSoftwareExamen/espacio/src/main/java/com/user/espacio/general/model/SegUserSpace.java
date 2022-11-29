package com.user.espacio.general.model;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "SEG_USER_SPACE")
@Data
@NoArgsConstructor
public class SegUserSpace {
    @EmbeddedId
    private SegUserSpacePK pk;

    @Column(name = "ROL", length = 3, nullable = false)
    private String rol;

    @Column(name = "STATUS", length = 3, nullable = false)
    private String status;

}
