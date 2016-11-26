<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page
import= "java.io.*"
import= "java.util.LinkedHashMap"
import= "util.csvReader"
import= "java.util.List"
import= "java.util.ArrayList"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
table {
    font-family: arial, arial;
    border-collapse: collapse;
    width: 80%;
    height: 100%;
}

td, th {
    border: 1px solid grey;
    text-align: center;
    padding: 1px;
}

tr:nth-child(even) {
    background-color: #898564;
    color: #fffffd
}
</style>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.css">

    <link rel="stylesheet" type="text/css" href="css/style.css">

    <title>Exito</title>
</head>

<body ng-app="DeploymentMonitor"  ng-controller="AppCtrl" ng-cloak >

<%
csvReader reader = new csvReader();

%>


 <md-subheader class="md-primary" ng-style="{width:'100%'}">.</md-subheader>
 <br>
<div layout="raw" layout-align="space-around stretch">

 <form name="form" action="companyProfile.jsp" method="GET">
 <input type="hidden" id="name" name="name" value="" />
 </form>

<table>
  <tr>
    <th>Company</th>
    <th>Country</th>
    <th>Net worth</th>
    <th>Predicted Time</th>
    <th>Priority</th>
  </tr>
  <tr ng-repeat="company in companies">
        <td>
        <md-button md-no-ink class="md-primary" ng-click="send(company.name)"><b>{{ company.name }}</b></md-button>
        </td>
    <td>{{ company.country }}</td>
    <td>N/A</td>
    <td>{{ company.time }}</td>
    <td>{{company.p}}%</td>
  </tr>
</table>

<!-- Angular Material requires Angular.js Libraries -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-animate.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-aria.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-messages.min.js"></script>

<!-- Angular Material Library -->
<script src="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.js"></script>

<!-- Angular Graphs-->
<script src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
<script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.ocean.js"></script>
<script type="text/javascript" src="js/angular-fusioncharts.min.js"></script>


<!-- bootstrap  -->
<script type="text/javascript">

        var deploymentMonitor = angular.module('DeploymentMonitor', ['ngMaterial','ng-fusioncharts']);

        deploymentMonitor.controller('AppCtrl', function($scope, $mdDialog) {

            $scope.toMap = function(){
                window.location = 'countryMap.jsp';
            }
            $scope.toList = function(){
                window.location = 'companyList.jsp';
            }
            $scope.send = function(name){
                 document.getElementById('name').value = name;
                 document.form.submit();
            }

             $scope.companies = <%= reader.read()%>

        });

</script>

</body>

</html>
