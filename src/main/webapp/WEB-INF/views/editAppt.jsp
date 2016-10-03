<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Appointment</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- MaCarouselin CSS -->
    <link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">

    <!-- Main CSS -->
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">


    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">

    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="<c:url value="/resources/js/jquery.min.js" />"<\/script>')</script>
    <script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>
<!-- Content Wrapper. Contains page content -->
<div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h1>Edit Appointment</h1>

            <p class="lead">Please update the Appointment information here!</p>
        </div>

        <form:form action="${pageContext.request.contextPath}/apptList/editAppt"
                   method="post" commandName="appt" enctype="multipart/form-data">

            <form:hidden path="appt_nbr" value="${appt.appt_nbr}"/>

        <div class="form-group">
            <label for="po_nbr">PO Nbr</label>
            <form:textarea path="po_nbr" id="appt_nbr" class="form-Control"
                           value="${appt.po_nbr}"/>
        </div>

        <div class="form-group">
            <label for="appt_status">Appt Status</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_status" id="appt_status" value="RCVD"/>
                SCHD</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_status" id="appt_status" value="OPEN"/>
                OPEN</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_status" id="appt_status" value="RCVD"/>
                RCVD</label>
        </div>


        <div class="form-group">
            <label for="appt_status">Appt Type</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_type" id="appt_type" value="ASN"/>
                ASN</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_type" id="appt_type" value="PO"/>
                PO</label>
            <label class="checkbox-inline"><form:radiobutton path="appt_type" id="appt_type" value="NSC"/>
                NSC</label>
        </div>

        <div class="form-group">
            <label for="door_id">Door Id</label>
            <form:textarea path="door_id" id="door_id" class="form-Control"
                           value="${appt.door_id}"/>
        </div>
        <input type="submit" value="submit" class="btn btn-success">
        <a href="<c:url value="/apptList"/>" class="btn btn-warning">Cancel</a>
        </form:form>
</body>
</html>
