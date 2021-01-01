<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 1/1/2021
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>List Customers</title>
  </head>
  <body>
    <table>
      <thead>
        <tr>
          <th>Tên</th>
          <th>Ngày sinh</th>
          <th>Địa chỉ</th>
          <th>Ảnh</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${listCustomer}" var="customer">
          <tr>
            <td>${customer.name}</td>
            <td>${customer.dob}</td>
            <td>${customer.address}</td>
            <td>
              <img src="${customer.srcImg}"/>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>