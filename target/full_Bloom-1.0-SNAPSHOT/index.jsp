<%--
  Created by IntelliJ IDEA.
  User: 759517209@qq.com
  Date: 2017/12/5
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>FULL BLOOM</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

    <link rel="stylesheet" href="static/css/swiper.min.css">
    <link rel="stylesheet" href="static/css/style.css">
    <link rel="stylesheet" href="static/css/bootstrap.min.css">

    <script src="/static/js/jquery.min.js"></script>

</head>
<body>
<%--head--%>
<c:import url="./header.jsp">
    <c:param name="nav" value="index"/>
</c:import>
<!-- Swiper -->
<div class="swiper-container">
    <div class="swiper-wrapper">
        <div class="swiper-slide page-main-picture" hidden_party_id="1">
            <div class="page-main-picture-canvas">
                <p>jintiashigehaotizi</p>
                <a href="/detail?partyID=1"><button class="btn btn-success" id="detail">watch</button></a>
            </div>
        </div>
        <div class="swiper-slide">Slide 2</div>
        <%--<div class="swiper-slide">Slide 3</div>--%>
        <%--<div class="swiper-slide">Slide 4</div>--%>
        <%--<div class="swiper-slide">Slide 5</div>--%>
        <%--<div class="swiper-slide">Slide 6</div>--%>
        <%--<div class="swiper-slide">Slide 7</div>--%>
        <%--<div class="swiper-slide">Slide 8</div>--%>
        <%--<div class="swiper-slide">Slide 9</div>--%>
        <%--<div class="swiper-slide">Slide 10</div>--%>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination"></div>
</div>

<!-- Swiper JS -->
<script src="static/js/swiper.min.js"></script>

<!-- Initialize Swiper -->
<script>
    var swiper = new Swiper('.swiper-container', {
        direction: 'vertical',
        pagination: {
            el: '.swiper-pagination',
            clickable: true,
        },
    });

//    // 跳转详情页
//    $("#detail").on("click", function () {
//        var partyID = $(this).prop("hidden_party_id")
//        var $t = $(this)
//        $t.text('正在前往')
//        $.post('/detail', {
//            partyID: partyID
//        }).done(function (data) {
//
//        })
//    })
</script>
</body>
</html>
