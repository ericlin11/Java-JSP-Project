<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <body>
        <nav>
            <ul>
                <li><a href="LogStudents">Log</a></li>
                <li><a href="ViewStudents">View</a></li>
                <li><a href="ModifyStudents">Modify</a></li>
            </ul>
        </nav>

        <p>Employee</p>
        <select name="Student" id="Students">
            
        </select>

        <table>
            <tr>
                <th>Date</th>
                <th>In</th>
                <th>Out</th>
                <th>PayRate</th>
            </tr>

            <c:forEach items="${list}" var="item">
                <tr>
                    <td><c:out value="${item.date}" /></td>
                    <td><c:out value="${item.in}" /></td>
                    <td><c:out value="${item.out}" /></td>
                    <td><c:out value="${item.payRate}" /></td>
                </tr>
            </c:forEach>
        </table>
        <label>Total:</label>
    </body>
</html>
