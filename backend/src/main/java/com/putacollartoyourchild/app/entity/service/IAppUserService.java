package com.putacollartoyourchild.app.entity.service;

import java.util.List;

import com.putacollartoyourchild.app.entity.model.AppUser;

public interface IAppUserService {
	public List<AppUser> getAll();
	public AppUser getOne(long id);
	public void insert(AppUser appUser);
}
