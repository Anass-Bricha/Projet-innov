package org.health.project.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*@Entity
@Data
@AllArgsConstructor @NoArgsConstructor*/
public class Roles implements Serializable {
    /*@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String role;
    @OneToMany(mappedBy = "role")
    private List<AppUser> appUserList = new ArrayList<>();*/
}
