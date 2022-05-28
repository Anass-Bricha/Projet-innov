package org.health.project.web;

import lombok.AllArgsConstructor;
import org.health.project.dtos.AppUserDto;
import org.health.project.repositories.AppUserRepository;
import org.health.project.services.AppUserService.AppUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class RegestrationRestController{

    private AppUserRepository appUserRepository;
    private AppUserService appUserService;



    @PostMapping(path = "/register")
    public ResponseEntity<?> registerUser(@RequestBody AppUserDto appUserDto){
        if(appUserRepository.existsByUsername(appUserDto.getUsername())){
            return new ResponseEntity<>("Username alredy taken", HttpStatus.BAD_REQUEST);
        }

        if(appUserRepository.existsByEmail(appUserDto.getEmail())){
            return new ResponseEntity<>("Email alredy taken", HttpStatus.BAD_REQUEST);
        }

        appUserService.registerUser(appUserDto);

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
