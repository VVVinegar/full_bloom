<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div class="header">
    <div class="header-console">
        <div class="container">
            <c:if test="${sessionScope.nickname == null}">
                <div class="row">
                    <div class="col-xs-4"></div>
                    <div class="col-xs-8 text-right header-console-links">
                        <a href="/login?from=${param.from != 'false' ? param.from : ''}" class="text-link">请登录</a>
                        <a href="/register" class="text-link">免费注册</a>
                    </div>
                </div>
            </c:if>

            <c:if test="${sessionScope.nickname != null}">
                <div class="row">
                    <div class="col-xs-4"></div>
                    <div class="col-xs-8 text-right">
                        hahahaha
                    </div>
                </div>
            </c:if>
        </div>
    </div>
</div>
