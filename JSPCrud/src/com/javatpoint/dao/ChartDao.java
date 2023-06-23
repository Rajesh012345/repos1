package com.javatpoint.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.javatpoint.bean.ProjectsAndSparesBean;

public class ChartDao {

//	private String jdbcUrl = "jdbc:mysql://localhost:3306/ivigil_crm";
//	private String jdbcUsername = "root";
//	private String jdbcpassword = "root";
//	private static final String getChartdDetails = "SELECT COALESCE(ir.project,0) AS projects,SUM(iri.`qty`)AS BothNoncostlyCostlyQuantity ,\r\n"
//			+ "  (\r\n"
//			+ "SELECT SUM(iri.`qty`) FROM `indent_request` irs1 LEFT JOIN `indent_request_items` iri ON irs1.`id`= iri.`indentRequestId` LEFT JOIN `spareitems` s ON s.`id`= iri.`spareItemId`\r\n"
//			+ " WHERE iri.`createdTime` BETWEEN '2023-04-01 00:00:00' AND '2023-04-31  23:59:59' AND irs1.`project`= ir.project    AND s.sap_code NOT IN ('CO-E-RM-00810','CO-E-RM-00831','CO-E-RM-00838','CO-E-RM-00852','CO-E-RM-00880','CO-E-RM-00881','CO-E-RM-00905','CO-E-RM-00906','CO-E-RM-00907','CO-E-RM-00305','CO-E-RM-00379','CO-E-RM-00809','CO-E-RM-000676','CO-E-RM-00830','CO-E-RM-00840','CO-E-RM-00851','CO-E-RM-00855','CO-E-RM-00915','CO-E-RM-00853','CO-E-RM-00805','CO-E-RM-00112','CO-E-RM-00235','CO-E-RM-00804','CO-E-RM-00803','CO-E-RM-00102','CO-E-RM-00242','CO-E-RM-00556','CO-E-RM-00801','CO-E-RM-00109','CO-E-RM-00568','CO-E-RM-00461','CO-E-RM-00110','CO-E-RM-00834','CO-E-RM-00544','CO-E-CM-00298','CO-E-CM-00303','CO-E-CM-00304','CO-E-RM-00845','CO-E-RM-00899','CO-E-RM-00543','CO-E-RM-00832','CO-E-RM-00841','CO-E-RM-00812','CO-E-RM-00811','CO-E-RM-00756','CO-E-RM-00784','CO-E-RM-00579','SC-A-CM-01141')\r\n"
//			+ "  GROUP BY irs1.project) AS NonCostlyQuantity\r\n"
//			+ " \r\n"
//			+ "  ,\r\n"
//			+ "    (\r\n"
//			+ "SELECT SUM(iri.`qty`) FROM `indent_request` irs2 LEFT JOIN `indent_request_items` iri ON irs2.`id`= iri.`indentRequestId` LEFT JOIN `spareitems` s ON s.`id`= iri.`spareItemId`\r\n"
//			+ " WHERE iri.`createdTime` BETWEEN '2023-04-01 00:00:00' AND '2023-04-31  23:59:59' AND irs2.`project`= ir.project  AND s.sap_code  IN ('CO-E-RM-00810','CO-E-RM-00831','CO-E-RM-00838','CO-E-RM-00852','CO-E-RM-00880','CO-E-RM-00881','CO-E-RM-00905','CO-E-RM-00906','CO-E-RM-00907','CO-E-RM-00305','CO-E-RM-00379','CO-E-RM-00809','CO-E-RM-000676','CO-E-RM-00830','CO-E-RM-00840','CO-E-RM-00851','CO-E-RM-00855','CO-E-RM-00915','CO-E-RM-00853','CO-E-RM-00805','CO-E-RM-00112','CO-E-RM-00235','CO-E-RM-00804','CO-E-RM-00803','CO-E-RM-00102','CO-E-RM-00242','CO-E-RM-00556','CO-E-RM-00801','CO-E-RM-00109','CO-E-RM-00568','CO-E-RM-00461','CO-E-RM-00110','CO-E-RM-00834','CO-E-RM-00544','CO-E-CM-00298','CO-E-CM-00303','CO-E-CM-00304','CO-E-RM-00845','CO-E-RM-00899','CO-E-RM-00543','CO-E-RM-00832','CO-E-RM-00841','CO-E-RM-00812','CO-E-RM-00811','CO-E-RM-00756','CO-E-RM-00784','CO-E-RM-00579','SC-A-CM-01141') \r\n"
//			+ "  GROUP BY irs2.project) AS CostlyQuantity\r\n"
//			+ "\r\n"
//			+ "\r\n"
//			+ " FROM `indent_request` ir LEFT JOIN `indent_request_items` iri ON ir.`id`= iri.`indentRequestId` LEFT JOIN `spareitems` s ON s.`id`= iri.`spareItemId`\r\n"
//			+ " WHERE iri.`createdTime` BETWEEN '2023-04-00 00:00:00' AND '2023-04-31  23:59:59' \r\n"
//			+ "  GROUP BY ir.project "; 
	
	
	private static final String getChartdDetails ="SELECT ir.status ,SUM(iri.`qty`) AS Quantity FROM `indent_request` ir  LEFT JOIN `indent_request_items` iri ON ir.id = iri.`indentRequestId` WHERE iri.`createdTime` BETWEEN \r\n"
			+ "'2023-04-01 00:00:00' AND '2023-04-30  23:59:59' GROUP BY ir.`status`ORDER BY  ir.`status`";

	
	public List<ProjectsAndSparesBean> getSitesAndSparesCountPerProject() {
		
		// using try-with-resources to avoid closing resources (boiler plate code)
		List<ProjectsAndSparesBean> list = new ArrayList<>();

		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();
				
				// Step 2:Create a statement using connection object
				PreparedStatement preparedStatement = connection.prepareStatement(getChartdDetails)) {
			 System.out.println("---------------------------Result-");
			// Step 3: Execute the query or update query
			ResultSet resultSet = preparedStatement.executeQuery();
			 System.out.println("---------------------------Result-");
         System.out.println("----------------------------"+resultSet);

			// Step 4: Process the ResultSet object.
			while (resultSet.next()) {

//				String projects = resultSet.getString("projects");
//				int sitesCount = resultSet.getInt("sitesCount");
//				int quantity = resultSet.getInt("quantity");
				
				String status = resultSet.getString("status");
				int _Quantity = resultSet.getInt("Quantity");
//				int NonCostlyQuantity = resultSet.getInt("NonCostlyQuantity");
//				int BothNoncostlyCostlyQuantity = resultSet.getInt("BothNoncostlyCostlyQuantity");
				
				
				list.add(new ProjectsAndSparesBean(status,_Quantity));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		System.out.println("list "+list.get(0));
		return list;
	}

	private void	printSQLException(SQLException ex ) {
	
	for(Throwable e:ex) {
		if(e instanceof SQLException) {
			
			e.printStackTrace(System.err);
			System.err.println("SQLState: " + ((SQLException) e).getSQLState());
            System.err.println("Error Code: " + ((SQLException) e).getErrorCode()); 
            System.err.println("Message: " + e.getMessage());
            Throwable t = ex.getCause();
            while (t != null) {
            	System.out.println("cause " + t);
            	t = t.getCause();
            }
		}
	}
	}
	
	
	
	
	

	public static Connection getConnection() {
		System.out.println("Connecting");
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ivigil_crm", "root", "root");
//			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		return con;
	}
	
	
	

}
