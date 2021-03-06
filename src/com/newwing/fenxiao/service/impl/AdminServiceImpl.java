package com.newwing.fenxiao.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.newwing.fenxiao.dao.IAdminDao;
import com.newwing.fenxiao.entities.Admin;
import com.newwing.fenxiao.service.IAdminService;

@Service("adminService")
@Scope("prototype")
public class AdminServiceImpl<T extends Admin> extends BaseServiceImpl<T> implements IAdminService<T> {

	@Resource(name = "adminDao")
	private IAdminDao adminDao;

	public Admin login(Admin admin) {
		return this.adminDao.login(admin);
	}

	public Admin getAdminName(String name) {
		return this.adminDao.getAdminName(name);
	}
	
}