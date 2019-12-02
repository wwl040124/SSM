package com.zhiyou.mapper;

import java.util.List;

import com.zhiyou.model.Admin;

public interface AdminMapper {
	public void add();

	public void delete(Integer id);

	public void update(Admin admin);

	public List<Admin> selectAll();

	public Admin selectById(Integer id);

}
