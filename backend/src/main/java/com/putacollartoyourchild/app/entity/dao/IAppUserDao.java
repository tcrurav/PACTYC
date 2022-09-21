package com.putacollartoyourchild.app.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.putacollartoyourchild.app.entity.model.AppUser;

public interface IAppUserDao extends CrudRepository<AppUser, Long>{

}
