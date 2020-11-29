<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!doctype html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Koc Finans</title>
  </head>
  
  <style>
	@import
		url('https://fonts.googleapis.com/css?family=Montserrat|Open+Sans');
	
	body {
		font-family: 'Open Sans', sans-serif;
		font-family: 'Montserrat', sans-serif;
	}
	
	input[type="text"], input[type="email"] {
		font-size: 1.6rem;
		color: #010100;
		width: 100%;
		line-height: 65px;
		padding-left: 3rem;
	}
	
	select {
		width: 100%;
		height: 65px;
		color: #010100;
		padding-left: 3rem;
	}
	
	.h1, h1 {
		font-size: 36px;
	}
	
	.h1, .h2, .h3, h1, h2, h3 {
		margin-top: 20px;
		margin-bottom: 10px;
	}
	
	.text-white {
		color: #fff !important;
	}
	
	.font-w400 {
		font-weight: 400;
	}
	
	.padding-top-xl {
		padding-top: 5rem !important;
	}
	
	.padding-bottom-xl {
		padding-bottom: 5rem !important;
	}
	
	.margin-top-m {
		margin-top: 3rem !important;
	}
	
	.margin-bottom-m {
		margin-bottom: 3rem !important;
	}
	
	.section5 h2 {
		line-height: 35px;
	}
	
	.section5 p {
		font-size: 16px;
		line-height: 26px;
	}
	
	.has-error input[type="text"], .has-error input[type="email"],
		.has-error select {
		border: 1px solid #a94442;
	}
</style>
  
  <body>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  
  	<section class="footer-form padding-top-xl padding-bottom-xl" aria-label="Contact Form">
  <div class="wrapper">
    <div class="container">
      <div class="row">
        <div class="col-xs-12 section5 text-center">
          <h2 class="h1 font-w400" style= "margin= 0">Credit Application Form</h2>
          <br><br>
        </div>
      </div>          
      <div class="row">
        <div class="col-lg-8">
		

 	<form action="#" th:action="@{/home}" th:object="${applicantModel}" method="post">
          <div class="form schedule-assessment">
            <div class="row margin-top-l">
            
	            <div class="form-group col-md-8">
	              <label for="full_name" class="sr-only">Full Name: </label>
	              <input name="fullName" id="fullName" placeholder="Full name" type="text" th:field="*{fullName}" required="required" data-error="Please enter your full name.">
	              <div class="help-block with-errors"></div>
	            </div><!-- close col-->  
	            <div class="form-group col-md-8">
	              <label for="phone_number" class="sr-only">Phone Number: </label>
	              <input name="phoneNumber" id="phoneNumber" placeholder="e.g: +905337123217" type="text" th:field="*{phoneNumber}" required="required" data-error="Please enter your phone number">
	              <div class="help-block with-errors"></div>
	            </div><!-- close col-->
	            <div class="form-group col-md-8">
	              <label for="income" class="sr-only">Income: </label>
	              <input name="income" id="income" placeholder="income" type="text"  th:field="*{income}"  required="required" data-error="Please enter your income">
	              <div class="help-block with-errors"></div>
	            </div>
	            <div class="form-group col-md-8">
	              <label for="national_id" class="sr-only">National ID: </label>
	              <input name="nationalId" id="nationalId" placeholder="National id" type="text" th:field="*{nationalId}"required="required" data-error="Please enter your national ID">
	              <div class="help-block with-errors"></div>
	            </div>
	             <div class="form-group text-center">
	             
            
            </div>
	            
            </div><!-- close row-->

          
           
            </div><!-- close row-->
            <br>
            <input class="submit center-block btn btn-primary" value="Submit" name="submit" type="submit">
           </form>
           
          </div>

        </div>
      </div>
    </div>

</section>
  
  </body>
</html>
