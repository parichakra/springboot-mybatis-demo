package com.parichakra.mybatis.mapper;

import com.parichakra.mybatis.model.AppUser;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface AppUserMapper {
    void insert(AppUser user);
    AppUser findById(Long id);
    List<AppUser> findAll();
    void update(AppUser user);
    void delete(Long id);
}
