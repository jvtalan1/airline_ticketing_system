<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search A Flight</title>

<spring:url value="/resources/css/base.css" var="baseCSS" />
<spring:url value="/resources/css/home.css" var="homeCSS" />
<spring:url value="/resources/js/script.js" var="script" />

<link rel="stylesheet" href="${baseCSS}">
<link rel="stylesheet" href="${homeCSS}">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script	src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>
<script src="${script}"></script>

</head>
<body>

	<div class="wrapper">

		<header>
			<button class="toggle-nav">
				<span>></span>
			</button>
			<ul class="nav">
				<li class="loud"><a href="#">Home</a></li>
				<li class="loud"><a href="#">Recent Searches</a></li>
				<li class="loud"><a href="#">Help</a></li>
				<li class="loud"><a href="#">Log in</a></li>
			</ul>
		</header>

		<div class="flight-search">

			<div class="search-container">

				<form:form method="get" action="searchFlight.html"
					modelAttribute="flightInfo">

					<input type="radio" name="ticketType" value="round-trip" id="round-trip">
					<label for="round-trip">Round-trip</label>

					<input type="radio" name="ticketType" value="one-way" id="one-way">
					<label for="one-way">One-way</label>
					<hr />

					<div class="content-column">
						<form:label path="fromCityId">From</form:label>
						<br />
						<form:input path="fromCityId" placeholder="City, Country"></form:input>
						<br />

						<form:label path="toCityId">To</form:label>
						<br />
						<form:input path="toCityId" placeholder="City, Country"></form:input>
						<br />

						<form:label path="departureTime">Depart on</form:label>
						<br />
						<form:input path="departureTime" id="fromdate" class="datepicker"></form:input>
						<span class="glyphicon glyphicon-calendar"></span>
						<br />

						<form:label path="arrivalTime">Return on</form:label>
						<br />
						<form:input path="arrivalTime" id="todate" class="datepicker"></form:input>
						<span class="glyphicon glyphicon-calendar"></span>
						<br />

						<form:label path="numberOfPassenger">Travelers</form:label>
						<br />
						<form:input path="numberOfPassenger" placeholder="Number"></form:input>

						<input type="submit" name="submit" class="btn btn-lg btn-primary" value="Search Flights">
				
					</div>
				</form:form>

			</div>

		</div>
	</div>

</body>
</html>