<%@ page contentType="text/html;charset=UTF-8"%>
<%!
public double triangle(double widht, double height)
 {
    double bar = widht * height / 2;
    return bar;
 }
 %>
 三角の面積（底辺５、高さ２の場合）:
 <%=
 triangle(5, 2)
 %>
