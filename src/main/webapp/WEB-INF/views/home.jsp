<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

<div>
    <h2>Tresc...</h2>
    <h3>Tresc...</h3>
    <ol>
        <c:forEach var="stock" items="${stocks}">
            ${stock.stockName} - <c:out value="${stock.stockCode}"/> </br>
        </c:forEach>
    </ol>
</div>