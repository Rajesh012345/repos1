package Util;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class jdbcUtil {

	private static Log log = LogFactory.getLog("JdbcUtilLog");

	private static String configFile = "jdbc";
	private static ResourceBundle resourceBundle;
	private static String jdbcDriver = "com.mysql.jdbc.Driver";

	private static String jdbcCrmUser = "root";
	private static String jdbcCrmPassword = "root";
	private static String jdbcCrmUrl = "jdbc:mysql://localhost:3306/test";
	
	
//	private static String jdbcReportsUser = "root";
//	private static String jdbcReportsPassword = "root";
//	private static String jdbcReportsUrl = "";
	
	private static String jdbcPotentialQuery = "";
	private static String jdbcVSQuery="";
	private static String prop_jdbcDriver = "jdbcDriver";

	private static String prop_jdbcCrmUser = "jdbcCrmUser";
	private static String prop_jdbcCrmPassword = "jdbcCrmPassword";
	private static String prop_jdbcCrmUrl = "jdbcCrmUrl";
	
	private static String prop_jdbcPotentialQuery = "jdbcPotentialQuery";
	private static String prop_jdbcVSQuery = "jdbcVSQuery";
	
//	private static String prop_jdbcReportsUser = "jdbcReportsUser";
//	private static String prop_jdbcReportsPassword = "jdbcReportsPassword";
//	private static String prop_jdbcReportsUrl = "jdbcReportsUrl";
	
	
	static {
		try {
			
			resourceBundle = ResourceBundle.getBundle(configFile, Locale.getDefault());

			jdbcDriver = getString(prop_jdbcDriver, "com.mysql.jdbc.Driver");
			jdbcCrmUser = getString(prop_jdbcCrmUser, "");
			jdbcCrmPassword = getString(prop_jdbcCrmPassword, "");
			jdbcCrmUrl = getString(prop_jdbcCrmUrl, "");
			
//			jdbcReportsUser = getString(prop_jdbcReportsUser, "");
//			jdbcReportsPassword = getString(prop_jdbcReportsPassword, "");
//			jdbcReportsUrl = getString(prop_jdbcReportsUrl, "");
			
			jdbcPotentialQuery = getString(prop_jdbcPotentialQuery,"");

			jdbcVSQuery = getString(prop_jdbcVSQuery,"");
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}

	public static Connection getCrmConnection() {
		try {
			Class.forName(jdbcDriver);
			Connection con = DriverManager.getConnection(jdbcCrmUrl, jdbcCrmUser, jdbcCrmPassword);
			return con;
		} catch (ClassNotFoundException e) {
			log.error(e.getMessage(), e);
		} catch (SQLException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error("Error while getting crm  db connection");
		}
		return null;
	}
	
	
//	public static Connection getReportsConnection() {
//		try {
//			Class.forName(jdbcDriver);
//			Connection con = DriverManager.getConnection(jdbcReportsUrl, jdbcReportsUser, jdbcReportsPassword);
//			return con;
//		} catch (ClassNotFoundException e) {
//			log.error(e.getMessage(), e);
//		} catch (SQLException e) {
//			log.error(e.getMessage(), e);
//		} catch (Exception e) {
//			log.error("Error while getting Reports  db connection");
//		}
//		return null;
//	}
	

	public static String getPotentialQuery() {
		return jdbcPotentialQuery;
	}
	
	public static String getVSQuery() {
		return jdbcVSQuery;
	}
	

	private static String getString(String key, String defaultValue) {
		try {
			String s;
			s = resourceBundle.getString(key);
			log.error("Read property " + key + " = '" + s + "'");
			return (s != null) ? s : defaultValue;
		} catch (Exception e) {
			log.error("caught exception " + e + " Key : " + key);
		}
		return defaultValue;
	}
}
