package com.javatpoint.Servelet;

import java.io.IOException;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javatpoint.bean.ProjectsAndSparesBean;
import com.javatpoint.dao.ChartDao;

public class SparesSitesCountChartServelet {

//	@WebServlet("/")

@WebServlet(name="hello",urlPatterns={"/hello"}) // added this line
	public class UserServlet extends HttpServlet {
	    private static final long serialVersionUID =1L ;
	    private ChartDao ChartDao;

	    public void init() {
	        ChartDao = new ChartDao();
	    }


	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	        String action = request.getServletPath();

	        try {
	            switch (action) {
	            
	                default:
	                    listUser(request, response);
	                    break;
	            }
	        } catch (SQLException ex) {
	            throw new ServletException(ex);
	        }
	    }

	    private void listUser(HttpServletRequest request, HttpServletResponse response)
	    throws SQLException, IOException, ServletException {

	       
	        List < ProjectsAndSparesBean > listSparesSitesCount = ChartDao.getSitesAndSparesCountPerProject();

	  
	        request.setAttribute("listSparesSitesCount", listSparesSitesCount);
	        RequestDispatcher dispatcher = request.getRequestDispatcher("ProjectsChart.jsp");
	        dispatcher.forward(request, response);
	       
	    }
	}
}
	

