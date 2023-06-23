package com.javatpoint.dao;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.javatpoint.bean.ProjectsAndSparesBean;
import com.javatpoint.dao.ChartDao ;

public class Charts {

	
	public static void main(String[] args) {
		
		ChartDao chartDao = new ChartDao();

		System.out.println("-------------------------");
		List<ProjectsAndSparesBean> resultList =	chartDao.getSitesAndSparesCountPerProject();
		 
		System.out.println("-------------------------");
		System.out.println(resultList);
		
		
//		  Map<Object, Object> map =null;
//		  
//		  List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();
//		  
//		  map = new HashMap<Object,Object>();
//		  map.put("label1", "FY07");
//		  map.put("y1", 188);
//		  map.put("labe2", "FY08");
//		  map.put("y2", 1160);
//		list.add(map);
//		
//		  map = new HashMap<Object,Object>();
//		  
//		list.add(map);
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list);
//		
//		
	}
	
	
}



