package com.example.template.models;

import com.example.template.enums.ERoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private ERoleType name;

    private String description;

    public Role(ERoleType name, String description) {
        this.name = name;
        this.description = description;
    }
}
