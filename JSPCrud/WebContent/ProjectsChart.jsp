<%@page import="com.javatpoint.bean.ProjectsAndSparesBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.google.gson.Gson"%>
<%@ page import="com.google.gson.JsonObject"%>
<%@ page import="com.javatpoint.bean.ProjectsAndSparesBean"%>
 <%@ page import="com.javatpoint.dao.ChartDao"%>
 
 ProjectsWiseSparesService obj ;
 

<%
ChartDao obj = new ChartDao();


List<ProjectsAndSparesBean> list1=obj.getSitesAndSparesCountPerProject();

// System.out.println("..............//////////..........."+ list1.get(3).getProjects());
    list1.get(0).getStatus();
        request.setAttribute("list",list1); 



 

Gson gsonObj = new Gson();
Map<Object,Object> map = null;
List<Map<Object,Object>> list = new ArrayList<Map<Object,Object>>();



 
map = new HashMap<Object,Object>();
map.put("label", "Sunday");
map.put("y", 60);
list.add(map);


map = new HashMap<Object,Object>();
map.put("label", "Monday");
map.put("y", 30);
list.add(map);


map = new HashMap<Object,Object>();
map.put("label", "Tuesday");
map.put("y", 25);
list.add(map);

map = new HashMap<Object,Object>(); map.put("label", "Wednesday"); map.put("y", 30); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Thursday"); map.put("y", 35); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Friday"); map.put("y", 20); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Saturday"); map.put("y", 30); list.add(map);
 
String dataPoints1 = gsonObj.toJson(list);
 
list = new ArrayList<Map<Object,Object>>();
map = new HashMap<Object,Object>(); map.put("label", "Sunday"); map.put("y", 45); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Monday"); map.put("y", 20); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Tuesday"); map.put("y", 25); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Wednesday"); map.put("y", 20); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Thursday"); map.put("y", 25); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Friday"); map.put("y", 20); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Saturday"); map.put("y", 20); list.add(map);
 
String dataPoints2 = gsonObj.toJson(list);
 
list = new ArrayList<Map<Object,Object>>();
map = new HashMap<Object,Object>(); map.put("label", "Sunday"); map.put("y", 0); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Monday"); map.put("y", 25); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Tuesday"); map.put("y", 20); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Wednesday"); map.put("y", 25); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Thursday"); map.put("y", 45); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Friday"); map.put("y", 25); list.add(map);
map = new HashMap<Object,Object>(); map.put("label", "Saturday"); map.put("y", 35); list.add(map);
 
String dataPoints3 = gsonObj.toJson(list);
%>
 
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
window.onload = function() { 
 
var chart = new CanvasJS.Chart("chartContainer", {
	theme: "light2",
	title: {
		text: "Spares Analyzation"
	},
	subtitles: [{
		text: "Raised Spares"
	}],
	axisY: {
		title: "Spares Raised count"
	},
	toolTip: {
		shared: true,
		reversed: true		
	},
	data: [{
		type: "stackedColumn",
		name: "Both",
		showInLegend: true,
		yValueFormatString: "#,##0 min",
		dataPoints: <%out.print(dataPoints1);%>
	},
	{
		type: "stackedColumn",
		name: "Costly",
		showInLegend: true,
		yValueFormatString: "#,##0 min",
		dataPoints: <%out.print(dataPoints2);%> 
	},
	{
		type: "stackedColumn",
		name: "NonCostly",
		showInLegend: true,
		yValueFormatString: "#,##0 min",
		dataPoints: <%out.print(dataPoints3);%> 
	}]
});
chart.render();
 
}
</script>
</head>
<body>
<div id="chartContainer" style="height: 370px; width: 100%;"></div>
<script src="https://cdn.canvasjs.com/canvasjs.min.js"></script>
</body>
</html>                     


