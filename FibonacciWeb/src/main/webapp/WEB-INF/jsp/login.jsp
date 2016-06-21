<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Moondancer's Math | Login</title>

    <link rel="stylesheet" href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/signin.css" />
</head>
<body>

<c:url var="loginUrl" value="${pageContext.request.contextPath}/login" />
<div class="container">
    <form action="/${loginUrl}" method="post" class="form-signin">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <h2 class="form-signin-heading">Please sign in</h2>

        <c:if test="${param.error != null}">
            <div class="alert alert-danger" role="alert">
                <p>
                    Invalid username and password.
                </p>
            </div>
        </c:if>

        <label for="username" class="sr-only">Email address</label>
        <input type="text" id="username" name="username" class="form-control" placeholder="Username" required="" autofocus="">

        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" name="password" class="form-control" placeholder="Password" required="">

        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
    </form>
</div>

</body>
</html>
