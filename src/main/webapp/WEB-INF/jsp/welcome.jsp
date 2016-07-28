<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

<body>
	<c:url value="/resources/text.txt" var="url"/>
	Time: ${time}
	<br>
	JSTL URL: ${url}
	<br>
	Message: ${message}
    
    <table border="1">
        <tbody>
            <tr>
                <td>123</td>
                <td>32</td>
                <td>4</td>
            </tr>
            <tr>
                <td>123</td>
                <td>32</td>
                <td>4</td>
            </tr>
            <tr>
                <td>123</td>
                <td>32</td>
                <td>4</td>
            </tr>
            <tr>
                <td>123</td>
                <td>32</td>
                <td>4</td>
            </tr>
        </tbody>
    
    </table>
</body>

</html>