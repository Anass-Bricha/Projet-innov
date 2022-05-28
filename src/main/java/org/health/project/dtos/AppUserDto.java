package org.health.project.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.health.project.entites.Roles;
import org.health.project.enums.Gender;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor @NoArgsConstructor
public class AppUserDto {
    private String username;
    private String password;
    private String email;
    private Gender gender;
}
