'use strict';

(function(angular) {
    var core = angular.module('App');

    core.factory('UserService', ['$http', function ($http) {
        function getUser(successCallback, errorcallback) {
            $http.get('/user').then(successCallback, errorcallback);
        }

        return {
            getUser: getUser
        };
    }])
})(angular);
