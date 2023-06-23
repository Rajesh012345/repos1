package com.javatpoint.dao;

import java.util.List;

import com.javatpoint.bean.ProjectsAndSparesBean;

public class ProjectsWiseSparesService {

	 ChartDao chartDao;
	

	
	public List<ProjectsAndSparesBean> getSitesAndSparesCount() {
		List<ProjectsAndSparesBean> obj = chartDao.getSitesAndSparesCountPerProject();
	 System.out.println("---------"+obj);
	 return  obj;
	}
	

		}
	
	
	
	

