'use strict';

(function(angular) {
    var core = angular.module('App');

    core.controller('WelcomeCtrl', [function () {
        this.userName = 'John Doe';
    }])
})(angular);
