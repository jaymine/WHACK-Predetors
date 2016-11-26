<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page
import= "java.io.*"
import= "java.util.LinkedHashMap"
import= "java.util.List"
import= "util.csvReader"
import= "java.util.ArrayList"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>

</style>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.css">

    <link rel="stylesheet" type="text/css" href="css/style.css">

    <title>Exito</title>
</head>

<body ng-app="DeploymentMonitor"  ng-controller="AppCtrl" ng-cloak >
<div layout="column" layout-align="center center">

<md-subheader class="md-primary" ng-style="{width:'100%','left-padding':'50'}">Company profile</md-subheader>

<div layout="row" layout-align="space-around center">
<h2><%= request.getParameter("name")%></h2>

<%
csvReader reader = new csvReader();

%>
 <md-button md-no-ink class="md-raised md-warn" layout layout-align="center center">
 <span>Predicted Time to become a customer<br> <%= reader.getTime(request.getParameter("name"))%> days </span>
 </md-button>

<md-button md-no-ink class="md-raised md-primary" layout layout-align="center center">
 <span>Priority of the customer<br> <%= reader.getP(request.getParameter("name"))%>% </span>
 </md-button>
</div>

  <md-content ng-style="{'width':'85%', 'boarder':'5px solid grey'}">
     <md-tabs md-dynamic-height md-border-bottom>
      <md-tab label="Suggestions">
         <md-content class="md-padding">
           <h2 class="md-display-2">Suggestions</h2>
           <p>Invite to Wso2 IS mobile connector webinar <md-button class="md-primary">Invite</md-button></p>
           <p>Send a mail attaching How to configure WSO2 IS mobile connector white paper<md-button class="md-primary">SEND</md-button></p>
           <p>Send a mail attaching How to configure WSO2 SAML metadata white paper <md-button class="md-primary">SEND</md-button></p>
           <p>Send a mail attaching How to configure travelocity SAML configuration white paper <md-button class="md-primary">SEND</md-button></p>
         </md-content>
      </md-tab>
       <md-tab label="Recent Activities">
            <md-content class="md-padding">
              <h2 class="md-display-2">Recent Activities</h2>
              <p>"john@zooyork.com"Download Wso2 IS 5.2.0</p>
              <p>"elizabeth@zooyork.com":Visited White paper: How to configure SAML Service Provider</p>
              <p>"farrok@zooyork.com":Visited White paper: How to configure SAML Identity Provider</p>
              <p>"hannah@zooyork.com":Attended Webinar on LDAP user store</p>
              <p>"johny@zooyork.com":Download Wso2 API mannager</p>
            </md-content>
       </md-tab>
       <md-tab label="BANT USERS">
         <md-content class="md-padding">
           <h2 class="md-display-2">BANT qualified Users</h2>
           <p>john@zooyork.com </p>
           <p>farook@zooyork.com </p>
           <p>nathasha@zooyork.com </p>
           <p>sammy@zooyork.com </p>
           <p>bravo@zooyork.com </p>
         </md-content>
       </md-tab>
       <md-tab label="SQL USERS">
         <md-content class="md-padding">
           <h2 class="md-display-2">SQL Users</h2>
            <p>phelix@zooyork.com </p>
                       <p>camaron@zooyork.com </p>
                       <p>hilaria@zooyork.com </p>
                       <p>jane@zooyork.com </p>
                       <p>colron@zooyork.com </p>
         </md-content>
       </md-tab>
       <md-tab label="RAW LEADS">
         <md-content class="md-padding">
           <h2 class="md-display-2">Raw LEADS</h2>
           <p>silvia@zooyork.com </p>
                      <p>sharuk@zooyork.com </p>
                      <p>ashen@zooyork.com </p>
                      <p>jaynthi@zooyork.com </p>
                      <p>jehan@zooyork.com </p>
         </md-content>
       </md-tab>
     </md-tabs>
   </md-content>


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



        });

</script>

</body>

</html>
