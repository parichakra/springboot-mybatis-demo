package com.parichakra.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parichakra.mybatis.mapper.AppUserMapper;
import com.parichakra.mybatis.model.AppUser;

@Service
public class AppUserService {
    private final AppUserMapper appUserMapper;

    public AppUserService(AppUserMapper appUserMapper) {
        this.appUserMapper = appUserMapper;
    }

    public List<AppUser> getAll() {
        return appUserMapper.findAll();
    }

    public AppUser getById(Long id) {
        return appUserMapper.findById(id);
    }

    public void create(AppUser user) {
        appUserMapper.insert(user);
    }

    public void update(AppUser user) {
        appUserMapper.update(user);
    }

    public void delete(Long id) {
        appUserMapper.delete(id);
    }
}
