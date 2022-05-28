package org.health.project.mappers.AppUserMapper;

import org.health.project.dtos.AppUserDto;
import org.health.project.entites.AppUser;

public interface AppUserMapper {
    AppUserDto from_AppUser_To_AppUserDto(AppUser appUser);
    AppUser from_AppUserDto_To_AppUser(AppUserDto appUserDto);
}
