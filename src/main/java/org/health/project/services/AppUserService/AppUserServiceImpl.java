package org.health.project.services.AppUserService;

import lombok.AllArgsConstructor;
import org.health.project.dtos.AppUserDto;
import org.health.project.entites.AppUser;
import org.health.project.entites.Roles;
import org.health.project.mappers.AppUserMapper.AppUserMapper;
import org.health.project.repositories.AppUserRepository;
import org.health.project.repositories.RolesRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private AppUserRepository appUserRepository;
    private AppUserMapper appUserMapper;
    private PasswordEncoder passwordEncoder;
    private RolesRepository rolesRepository;


    @Override
    public AppUserDto registerUser(AppUserDto appUserDto){
        Roles roles = new Roles();
        roles.setRole("USER");
        rolesRepository.save(roles);

        AppUser appUser = appUserMapper.from_AppUserDto_To_AppUser(appUserDto);
        appUser.setPassword(passwordEncoder.encode(appUserDto.getPassword()));
        appUser.setRole(roles);
        AppUser savedAppUser = appUserRepository.save(appUser);
        return appUserMapper.from_AppUser_To_AppUserDto(savedAppUser);
    }
}
