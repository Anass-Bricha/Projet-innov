package org.health.project.mappers.AppUserMapper;

import org.health.project.dtos.AppUserDto;
import org.health.project.entites.AppUser;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AppUserMapperImpl implements AppUserMapper {
    private ModelMapper modelMapper = new ModelMapper();
    @Override
    public AppUserDto from_AppUser_To_AppUserDto(AppUser appUser) {
        AppUserDto appUserDto = modelMapper.map(appUser,AppUserDto.class);
        return appUserDto;
    }

    @Override
    public AppUser from_AppUserDto_To_AppUser(AppUserDto appUserDto) {
        AppUser appUser = modelMapper.map(appUserDto,AppUser.class);
        return appUser;
    }
}
