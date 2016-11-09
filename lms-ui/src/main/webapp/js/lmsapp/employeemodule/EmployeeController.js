angular.module('LmsApp').controller('EmployeeController',

function($scope, $location, EmployeeService, growl) {

	$scope.message = 'This is EmployeeController';
	$scope.employee = {};

	$scope.redirectToEmployeeDirectory = function() {
		$location.path("/employeelist");
	}
	$scope.redirectToAddEmployeePage = function() {

		$location.path("/addemployee");
	}
});
