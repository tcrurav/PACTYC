package com.putacollartoyourchild.app.entity.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.putacollartoyourchild.app.entity.dao.IAppUserDao;
import com.putacollartoyourchild.app.entity.model.AppUser;

@Service
public class AppUserService implements IAppUserService{
	
	@Autowired
	IAppUserDao appUserDao;

	@Override
	public List<AppUser> getAll() {
		return (List<AppUser>) appUserDao.findAll();
	}

	@Override
	public AppUser getOne(long id) {
		return appUserDao.findById(id).get();
	}

	@Override
	public void insert(AppUser appUser) {
		appUserDao.save(appUser);
	}

}
