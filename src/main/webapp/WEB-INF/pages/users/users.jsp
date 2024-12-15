<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="Users">
    <h1>Users</h1>
    <form method="POST" action="${pageContext.request.contextPath}/Users">
        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
            <a class="btn btn-primary btn-lg" href="${pageContext.request.contextPath}/AddUser">Add User</a>
            <%--Nu arata butonul de ivoice daca user-ul nu e in grup,si nici butonul de adauaga si cel de edit--%>
            <button class="btn btn-secondary btn-lg" type="submit">Invoice</button>

        </c:if>
        <div class="container text-center">
            <c:forEach var="user" items="${users}">
                <div class="row">
                    <div class="col">
                        <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
                            <input type="checkbox" name="user_ids" value="${user.id}" />
                        </c:if>
                    </div>
                    <div class="col">
                            ${user.id}
                    </div>
                    <div class="col">
                            ${user.userEmail}
                    </div>
                    <div class="col">
                            ${user.userName}
                    </div>
                    <div class="col">
                        <a class="btn btn-secondary" href="${pageContext.request.contextPath}/EditUser?id=${user.id}">Edit User</a>
                    </div>
                </div>
            </c:forEach>
        </div>
    </form>
    <c:if test="${not empty invoices}">
        <h2>Invoices</h2>
<%--Nu arata ivoice-urile daca user-ul nu e in grup--%>
    <c:if test="${pageContext.request.isUserInRole('WRITE_USERS')}">
        <c:forEach var="username" items="${invoices}" varStatus="status">
            ${status.index + 1}. ${username}
            <br/>
        </c:forEach>
    </c:if>
    </c:if>
</t:pageTemplate>