package com.rs.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.rs.model.Projects;

public interface ProjectsService {
	
	public List<Projects> showAll();
	
	public Projects getByAppid(String appid);
	
	public PageInfo<Projects> getByPage(Integer pageNum,Integer pageSize);
	
}
