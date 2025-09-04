package com.parichakra.mybatis.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parichakra.mybatis.model.AppUser;
import com.parichakra.mybatis.service.AppUserService;

@RestController
@RequestMapping("/users")
public class AppUserController {
    private final AppUserService appUserService;

    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping
    public List<AppUser> getAll() {
        return appUserService.getAll();
    }

    @GetMapping("/{id}")
    public AppUser getById(@PathVariable Long id) {
        return appUserService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody AppUser user) {
        appUserService.create(user);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody AppUser user) {
        user.setId(id);
        appUserService.update(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        appUserService.delete(id);
    }
}
