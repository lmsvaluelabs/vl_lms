angular.module('LmsApp').service('EmployeeService',['$http',
		function($http) {

			var httpURI = "/lms-ws/employee/";
			this.addEmployee = function(user) {
				
				return $http.post(httpURI,user);
			};
			this.getAllEmployee = function()
			{
				return $http.get(httpURI);
			};
			this.updateEmployee = function(user)
			{
				return $http.put(httpURI,user);
			};

			this.deleteEmployee = function(userid)
			{
				return $http.delete(httpURI+userid);
			};
			
		}]);
