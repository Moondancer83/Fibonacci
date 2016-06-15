'use strict';

/**
 * Core module's initializer
 */
(function(angular) {
    var core = angular.module('App');
    var resourcesPath = "resources/app/view";

    core.config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
                when('/', {
                    templateUrl: resourcesPath + '/welcome.html',
                    controller: 'WelcomeCtrl'
                }).
                when('/fibonacci', {
                    templateUrl: resourcesPath + '/fibonacci.html',
                    controller: 'FibonacciCtrl'
                }).
                otherwise({
                    redirectTo: '/'
                });
        }]);
})(angular);
