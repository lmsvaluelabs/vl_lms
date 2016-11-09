angular.module('LmsApp',
		[ 'ngRoute', 'ngResource', 'ngMessages', 'angular-growl' ]).config(
		[ '$routeProvider', 'growlProvider',
				function($routeProvider, growlProvider) {

					growlProvider.globalTimeToLive(3000);
					growlProvider.onlyUniqueMessages(true);

					$routeProvider.when('/', {
						templateUrl : 'partials/home.html',
						controller : 'EmployeeController'
					}).when('/employeelist', {
						templateUrl : 'partials/employeedirectory.html',
						controller : 'EmployeeController'
					}).when('/addemployee', {
						templateUrl : 'partials/addemployee.html',
						controller : 'EmployeeController'
					}).otherwise({
						redirectTo : '/'
					});
				} ]);
