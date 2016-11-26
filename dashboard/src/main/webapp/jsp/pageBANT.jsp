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


<fusioncharts
    width="800"
    height="600"
    type="mscombi2d"
    datasource="{{DataSource}}"
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

            $scope.toMap = function(){
                window.location = 'countryMap.jsp';
            }
            $scope.toList = function(){
                window.location = 'companyList.jsp';
            }


            $scope.DataSource = {
                            chart: {
                                caption: "Customer Prediction",
                                subcaption: "For Quarters",
                                xaxisname: "Quarter",
                                yaxisname: "Number of Customers",
                                numberprefix: "",
                                theme: "ocean"
                            },
                            categories: [
                                {
                                    category: [
                                        {
                                            label: "Oct '15"
                                        },
                                        {
                                            label: "Jan '16"
                                        },
                                        {
                                            label: "Apr '16"
                                        },
                                        {
                                            label: "Jul '16"
                                        },
                                        {
                                            label: "Oct '16"
                                        },
                                        {
                                            label: "Jan '17"
                                        },
                                        {
                                            label: "Apr '17"
                                        },
                                        {
                                            label: "Jul '17"
                                        }
                                    ]
                                }
                            ],
                            dataset: [
                                {
                                    seriesname: "Predicted Customers",
                                    data: [
                                        {
                                            value: "21"
                                        },
                                        {
                                            value: "11"
                                        },
                                        {
                                            value: "6"
                                        },
                                        {
                                            value: "8"
                                        },
                                        {
                                            value: "23"
                                        },
                                        {
                                            value: "13"
                                        },
                                        {
                                            value: "5"
                                        },
                                        {
                                            value: "8"
                                        }
                                    ]
                                },
                                {
                                    seriesname: "Actual Customers",
                                    renderas: "line",
                                    showvalues: "0",
                                    data: [
                                        {
                                            value: "17"
                                        },
                                        {
                                            value: "10"
                                        },
                                        {
                                            value: "7"
                                        },
                                        {
                                            value: "8"
                                        }

                                    ]
                                }
                            ]
                        };


        });

</script>

</body>

</html>
