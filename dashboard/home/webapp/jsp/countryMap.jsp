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

      <md-toolbar class="md-theme-indigo" ng-style="{color:'#638980'}">
        <h2 class="md-toolbar-tools">Filter by</h2>
      </md-toolbar>
      <div layout="column" layout-align="space-between start">
        <md-button  class="md-primary" ng-click = "toMap()">
          Country
        </md-button>
        <md-button  class="md-primary">
          Networth <input type="text" ng-style="{width:'50px'}"}/> to <input type="text" ng-style="{width:'50px'}"/>
        </md-button>
      </div>
      <md-toolbar class="md-theme-indigo" ng-style="{color:'#638980'}">
          <h2 class="md-toolbar-tools">Display</h2>
      </md-toolbar>
      <div layout="column" layout-align="space-between start">
          <md-button  class="md-primary" ng-click="toList()">
             View All
          </md-button>
      </div>
</md-sidenav>

<form name="form" id="form" action="listSortbyCountry.jsp" method="POST">
    <input type="hidden" id="countryName" name="countryName" value="" />
</form>

<div id="chart-container">A world map will load here!</div>

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


            $scope.populationMap = new FusionCharts({
               type: 'maps/world',
               renderAt: 'chart-container',
               width: '800',
               height: '600',
               dataFormat: 'json',
               dataSource: {
                   "chart": {
                       "caption": "Global Population",
                       "theme": "ocean",
                       "formatNumberScale": "0",
                       "numberSuffix": "M",
                       "showLabels": "1"
                   },
                   "colorrange": {
                       "color": [
                           {
                               "minvalue": "0",
                               "maxvalue": "100",
                               "code": "#D0DFA3",
                               "displayValue": "< 100M"
                           },
                           {
                               "minvalue": "100",
                               "maxvalue": "500",
                               "code": "#B0BF92",
                               "displayValue": "100-500M"
                           },
                           {
                               "minvalue": "500",
                               "maxvalue": "1000",
                               "code": "#91AF64",
                               "displayValue": "500M-1B"
                           },
                           {
                               "minvalue": "1000",
                               "maxvalue": "5000",
                               "code": "#A9FF8D",
                               "displayValue": "> 1B"
                           }
                       ]
                   },
                   "data": [
                       {
                           "id": "NA",
                           "value": "515",
                           "Font": "Helvetica",
                           "FontSize": "40",
                           "FontColor": "#383838"
                       },
                       {
                           "id": "SA",
                           "value": "373",
                           "Font": "Helvetica",
                           "FontSize": "15",
                           "FontColor": "#383838"
                       },
                       {
                           "id": "AS",
                           "value": "3875",
                           "Font": "Helvetica",
                           "FontSize": "35",
                           "FontColor": "#383838"
                       },
                       {
                           "id": "EU",
                           "value": "727",
                           "Font": "Helvetica",
                           "FontSize": "20",
                           "FontColor": "#383838"
                       },
                       {
                           "id": "AF",
                           "value": "885",
                           "Font": "Helvetica",
                           "FontSize": "25",
                           "FontColor": "#383838"
                       },
                       {
                           "id": "AU",
                           "value": "32",
                           "Font": "Helvetica",
                           "FontSize": "10",
                           "FontColor": "#383838"
                       }
                   ]
               },
               "events": {
                   "entityClick": function(evt, data) {
                       document.getElementById('countryName').value = data.label;
                       document.form.submit();
                   },
               }
           }).render();

        });

</script>

</body>

</html>
