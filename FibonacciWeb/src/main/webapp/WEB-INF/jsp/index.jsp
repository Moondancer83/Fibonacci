<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Fibonacci Calculator</title>

    <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/styles/app.css" />
</head>
<body data-ng-app="App" >

<div class="container" data-ng-view>
    Default content.
</div>

<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

<script src="webjars/angularjs/1.5.5/angular.min.js"></script>
<script src="webjars/angularjs/1.5.5/angular-route.min.js"></script>

<script src="${pageContext.request.contextPath}/resources/app/script/App.js"></script>
<script src="${pageContext.request.contextPath}/resources/app/script/AppRouter.js"></script>

<script src="${pageContext.request.contextPath}/resources/app/script/WelcomeCtrl.js"></script>

<script src="${pageContext.request.contextPath}/resources/app/script/FibonacciCtrl.js"></script>
<script src="${pageContext.request.contextPath}/resources/app/script/FibonacciService.js"></script>
<script src="${pageContext.request.contextPath}/resources/app/script/ListDirective.js"></script>

</body>
</html>
