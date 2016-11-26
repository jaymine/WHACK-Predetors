<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@page
import= "java.io.*"
import= "java.util.LinkedHashMap"
import= "java.util.List"
import= "java.util.ArrayList"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.css">

    <link rel="stylesheet" type="text/css" href="css/style.css">

    <title>Exito</title>
</head>


<body ng-app="DeploymentMonitor"  ng-controller="AppCtrl" ng-cloak >
<div layout="raw" layout-align="center">

<md-sidenav
        class="md-sidenav-left"
        md-component-id="left"
        md-is-locked-open="$mdMedia('gt-md')"
        md-whiteframe="4">

      <md-toolbar class="md-theme-indigo" ng-style="{'color':'#638980','font-size':'10px'}">
        <h2 class="md-toolbar-tools">Recent Activities</h2>
      </md-toolbar>
      <div layout="column" layout-align="space-between start" ng-style="{padding:'5px'}">
        <p>"john@fortune500.com" downloaded Wso2 IS 5.2.0</p>
        <p>"Elizabeth@fortune500.com" Accessed white paper: How to configure SSO in Wso2 IS 5.2.0</p>
        <p>"Elizabeth@fortune500.com" visited Webinar on IS Mobile Connect</p>
        <p>"Aliesia@fortune500.com" accessed White Paper: How to activate mobile connector in Wso2 IS</p>
        <p>"Malik@fortune500.com" Accessed Wso2 IS 5.2.0 documentation</p>
      </div>
      <md-toolbar class="md-theme-indigo" ng-style="{color:'#638980'}">
          <h2 class="md-toolbar-tools">Recent BANT qualified Users</h2>
      </md-toolbar>
      <div layout="column" layout-align="space-between start" ng-style="{padding:'5px'}">
        <p>john@fortune500.com</p>
        <p>Silvia@fortune500.com</p>
        <p>Malik@fortune500.com</p>
        <p>Aliesia@fortune500.com</p>
        <p>Elizabeth@fortune500.com</p>
      </div>
</md-sidenav>


<fusioncharts
    width="800"
    height="600"
    type="pie3d"
    datasource="{{myDataSource}}"
></fusioncharts>

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

            $scope.myDataSource = {
                chart: {
                    caption: "User Distribution",
                    subcaption: "Last Quarter",
                    animation: "1",
                    startingangle: "250",
                    showlabels: "0",
                    showlegend: "1",
                    enablemultislicing: "0",
                    slicingdistance: "15",
                    showpercentvalues: "1",
                    showpercentintooltip: "0",
                    plottooltext: " $label",
                    theme: "ocean"
                },
                data: [
                    {
                        label: "Vistors",
                        value: "80"
                    },
                    {
                        label: "Raw Lead",
                        value: "15"
                    },
                    {
                        label: "SQL",
                        value: "5"
                    },
                    {
                        label: "BANT",
                        value: "3"
                    },
                    {
                        label: "Customers",
                        value: "2"
                    }
                ]
            };

        });

</script>

</body>

</html>
