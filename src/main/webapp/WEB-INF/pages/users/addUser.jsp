<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Add User">
    <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}/AddUser">
        <div class="row">
            <div class="col-md-6 mb-3">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="username" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Username is required.
                </div>
                <label for="email">Email</label>
                <input type="text" class="form-control" id="email" name="email" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Email is required.
                </div>
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="" value="" required>
                <div class="invalid-feedback">
                    Password is required.
                </div>
                <label for="user_groups">Groups</label>
                <select class="custom-select d-block w-100" id="user_groups" name="user_groups" required>
                    <c:forEach var="user_group" items="${userGroups}" varStatus="status">
                        <option value="${user_group}">${user_group}</option>
                    </c:forEach>
                </select>
                <button class="mt-3 btn btn-primary btn-lg" type="submit">Save</button>
            </div>
        </div>
    </form>
</t:pageTemplate>