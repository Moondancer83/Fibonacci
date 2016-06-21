'use strict';

(function(angular) {
    var core = angular.module('App');

    core.factory('FibonacciService', ['$http', function ($http) {
        function getNthNumber(index, successCallback, errorcallback) {
            $http.get('math/fibonacci/' + index).then(successCallback, errorcallback);
        }

        function getFirstNNumber(index, successCallback, errorcallback) {
            $http.get('math/fibonacci/list/' + index).then(successCallback, errorcallback);
        }

        return {
            getNthNumber: getNthNumber,
            getFirstNNumber: getFirstNNumber
        };
    }])
})(angular);
