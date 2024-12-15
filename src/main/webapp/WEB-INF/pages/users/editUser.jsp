<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<t:pageTemplate pageTitle="Edit User">
  <form class="needs-validation" novalidate method="POST" action="${pageContext.request.contextPath}EditUser">
    <div class="row">
      <div class="col-md-6 mb-3">
        <label for="user_name">Usernname</label>
        <input type="text" class="form-control" id="user_name" name="user_name" placeholder="" value="${user.username}" required>
        <div class="invalid-feedback">
          Username is required.
        </div>
        <label for="email_edit">Email</label>
        <input type="text" class="form-control" id="email_edit" name="email_edit" placeholder="" value="${user.email}" required>
        <div class="invalid-feedback">
          Email is required.
        </div>
        <label for="owner_id">User_Id</label>
        <select class="custom-select d-block w-100" id="owner_id" name="owner_id" required>
          <option value="">Choose...</option>
          <c:forEach var="user" items="${users}" varStatus="status">
            <option value="${user.id}"${user.username eq user.userName ? 'selected' : ''}>${user.userName}</option>
          </c:forEach>
        </select>
        <input type="hidden" name="user_id" value="${user.id}" />
        <button class="mt-3 btn btn-primary btn-lg" type="submit">Save</button>

      </div>
    </div>
  </form>
</t:pageTemplate>