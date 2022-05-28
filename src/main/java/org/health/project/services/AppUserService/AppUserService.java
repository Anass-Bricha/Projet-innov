package org.health.project.services.AppUserService;

import org.health.project.dtos.AppUserDto;
import org.health.project.entites.AppUser;

public interface AppUserService {
    AppUserDto registerUser(AppUserDto appUserDto);
}
