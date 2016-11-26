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

    <md-content class="md-padding" flex>

        <div layout="row" layout-align="space-between center">

                <img ng-src="img/logo.png" ng-style="{height:'60px'}"/>

                <md-nav-bar md-selected-nav-item="currentNavItem" nav-bar-aria-label="navigation links">
                  <md-nav-item md-nav-click="goto('home')" name="index.html" class="md-secondary">
                    <span ng-style="{color:'#e3e5ef'}" >
                    HOME
                    </span>
                  </md-nav-item>
                  <md-nav-item md-nav-click="goto('bant')" name="jsp/pageBANT.jsp" class="md-secondary">
                      <span ng-style="{color:'#e3e5ef'}">
                      BANT
                      </span>
                  </md-nav-item>
                  <md-nav-item md-nav-click="goto('sql')" name="jsp/pageSQL.jsp" class="md-secondary">
                      <span ng-style="{color:'#e3e5ef'}">
                      SQL
                      </span>
                  </md-nav-item>
                  <md-nav-item md-nav-click="goto('raw')" name="jsp/pageRAWLEAD.jsp" class="md-secondary">
                      <span ng-style="{color:'#e3e5ef'}">
                      RAW LEAD
                      </span>
                  </md-nav-item>
                </md-nav-bar>
        </div>

    </md-content>

     <div class="ext-content" id="content" style="width:100%; height: 100%;">
         <object type="text/html" data="jsp/pageHome.jsp" style="width:100%; height: 100%;"></object>
     </div>

    <!-- footer-->
     <div layout="row" layout-align="space-between end">
         <md-content class="md-padding" flex>
            <md-nav-bar md-selected-nav-item="currentNavItem1" nav-bar-aria-label="navigation links">
            </md-nav-bar>
         </md-content>
     </div>

<!-- Angular Material requires Angular.js Libraries -->
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-animate.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-aria.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.5.5/angular-messages.min.js"></script>

<!-- Angular Material Library -->
<script src="http://ajax.googleapis.com/ajax/libs/angular_material/1.1.0/angular-material.min.js"></script>

<!-- bootstrap  -->
<script type="text/javascript">

        var deploymentMonitor = angular.module('DeploymentMonitor', ['ngMaterial']);

        deploymentMonitor.controller('AppCtrl', function($scope, $mdDialog) {



              $scope.indexpage =
              '<object type="text/html" data="jsp/pageHome.jsp" style="width:100%; height: 100%;"></object>';
              $scope.bantpage =
              '<span><object type="text/html" data="jsp/pageBANT.jsp" style="width:100%; height: 100%;"></object></span>';
              $scope.sqlpage =
              '<span><object type="text/html" data="jsp/pageSQL.jsp" style="width:100%; height: 100%;"></object></span>';
              $scope.rawleadpage =
              '<span><object type="text/html" data="jsp/pageRAWLEAD.jsp" style="width:100%; height: 100%;"></object></span>';

              $scope.goto = function(pageName) {
                if (pageName == 'home') {
                    document.getElementById("content").innerHTML= $scope.indexpage;
                }
                if (pageName == 'bant') {
                    document.getElementById("content").innerHTML= $scope.bantpage;
                }
                if (pageName == 'sql') {
                    document.getElementById("content").innerHTML= $scope.sqlpage;
                }
                if (pageName == 'raw') {
                    document.getElementById("content").innerHTML= $scope.rawleadpage;
                }
              }

        });

</script>

</body>

</html>
