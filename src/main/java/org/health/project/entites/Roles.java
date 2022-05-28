package org.health.project.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Roles {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    @OneToOne(mappedBy = "role")
    private AppUser appUser;
}
