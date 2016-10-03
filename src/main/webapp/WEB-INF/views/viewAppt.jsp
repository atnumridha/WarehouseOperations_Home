<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Appointments</title>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

    <!-- Bootstrap core CSS -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">

    <!-- MaCarouselin CSS -->
    <link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">

    <!-- Main CSS -->
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">


    <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
</head>
<body>
<div class="container-wrapper">
<div class="container">
    <div class="page-header">
        <h1>Appointment Detail</h1>
        <p class="lead">Here is the detail information of the appt:</p>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <p><span></span><strong>Appointment Nbr</strong><span>: ${appt.appt_nbr}</span></p>
                <p><span><strong>PO Nbr</strong>: ${appt.po_nbr}</span></p>
                <p><span><strong>Appointment Status</strong>: ${appt.appt_status}</span></p>
                <p><span><strong>Door Id</strong>: ${appt.door_id}</span></p>
                <p><span><strong>Appointment Type</strong>: ${appt.appt_type}</span></p>
                <br/>
                <a href="<c:url value="/apptList"/>" class="btn btn-warning">Back</a>
                <br/>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>

