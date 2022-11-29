package com.user.espacio.general.model;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
public class SegUserSpacePK implements Serializable {

    @Column(name = "COD_SPACE", nullable = false)
    private Integer cod_space;

    @Column(name = "COD_USER", nullable = false)
    private String cod_user;
}
