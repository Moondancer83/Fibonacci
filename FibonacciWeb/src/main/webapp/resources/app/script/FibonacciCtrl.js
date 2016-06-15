'use strict';

(function(angular) {
    var core = angular.module('App');

    core.controller('FibonacciCtrl', ['FibonacciService', function (FibonacciService) {
        var that = this;
        that.message = null;
        that.index = null;
        that.result = null;
        that.results = null;

        function setResult(response) {
            that.result = response.data;
        }

        function setResults(response) {
            that.results = response.data;
        }

        function showError(response) {
            that.message = 'Error: Resource response is ' + response.statusText;
        }

        function getNthNumber(index) {
            FibonacciService.getNthNumber(index, setResult, showError);
        }

        function getFirstNNumber(index) {
            FibonacciService.getFirstNNumber(index, setResults, showError);
        }

        function resetResults() {
            that.message = null;
            that.result = null;
            that.results = null;
        }

        that.getNthNumber = function() {resetResults(); getNthNumber(that.index)};
        that.getFirstNNumber = function() {resetResults(); getFirstNNumber(that.index)};

    }])
})(angular);