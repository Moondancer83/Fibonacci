'use strict';

(function(angular) {
    var core = angular.module('App');

    core.controller('WelcomeCtrl', ['UserService', function (UserService) {
        var that = this;
        that.message = null;
        that.userName = "";

        function setUserName(response) {
            that.userName = response.data;
        }

        function showError(response) {
            that.message = 'Error: Resource response is ' + response.statusText;
        }

        UserService.getUser(setUserName, showError);

    }])
})(angular);
