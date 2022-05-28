package org.health.project.services.AppUserService;

import lombok.AllArgsConstructor;
import org.health.project.dtos.AppUserDto;
import org.health.project.entites.AppUser;
import org.health.project.mappers.AppUserMapper.AppUserMapper;
import org.health.project.repositories.AppUserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class AppUserServiceImpl implements AppUserService {

    private AppUserRepository appUserRepository;
    private AppUserMapper appUserMapper;
    private PasswordEncoder passwordEncoder;
    //private RolesRepository rolesRepository;


    @Override
    public AppUserDto registerUser(AppUserDto appUserDto){
        /*Roles roles = new Roles();
        roles.setRole("USER");
        rolesRepository.save(roles);*/

        AppUser appUser = appUserMapper.from_AppUserDto_To_AppUser(appUserDto);
        appUser.setPassword(passwordEncoder.encode(appUserDto.getPassword()));
        appUser.setRole("USER");
        AppUser savedAppUser = appUserRepository.save(appUser);
        return appUserMapper.from_AppUser_To_AppUserDto(savedAppUser);
    }
}
