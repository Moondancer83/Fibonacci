'use strict';

(function(angular) {
    var core = angular.module('App');
    var resourcesPath = "resources/app/view";

    core.directive('dataList', function () {
        return {
            restrict: 'AE',
            scope: {
                list: '='
            },
            templateUrl: resourcesPath + '/dataList.html'
        };
    });
})(angular);
