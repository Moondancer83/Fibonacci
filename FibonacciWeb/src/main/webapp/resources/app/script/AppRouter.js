'use strict';

/**
 * Core module's initializer
 */
(function(angular) {
    var core = angular.module('App');
    var resourcesPath = "resources/app";

    core.config(['$routeProvider',
        function($routeProvider) {
            $routeProvider.
                when('/', {
                    templateUrl: resourcesPath + '/view/welcome.html',
                    controller: 'WelcomeCtrl'
                }).
                otherwise({
                    redirectTo: '/'
                });
        }]);
})(angular);