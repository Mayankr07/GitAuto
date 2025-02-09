<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <title>Complex Form</title>
  </head>
  <body>
          <div class="container mt-4">
            <div class="row">
	           <div  class="col-md-8 offset-md-2">
	             <div class="card-body">
	               <h3 class="text-center">Complex Form</h3>
	                <div class="alert alert-danger" role="alert">
					 
					  <f:errors path="stu.*" />
					  
					</div>
	               <form action="handleform"  method="post">
	                   
		                 <div class="form-group">
		                 <label>Your Name</label>
		                   <input type="text" name="name" placeholder="Enter Name" class="form-control">
		                 </div>
		                 
		                 
		                 <div class="form-group">
		                 <label>Your Id</label>
		                   <input type="text" name="id" placeholder="Enter Id " class="form-control">
		                 </div>
		                 
		                  <div class="form-group">
		                 <label>Your DOB</label>
		                   <input type="date" name="date" placeholder="Enter DOB dd/mm/yyyy " class="form-control">
		                 </div>
		                 
		                 
		                 <div class="form-group">
		                 <label>Select Cource</label>
		                 <select name="cources" class="form-control" > 
			                  <option>c </option>
			                  <option>c++ </option>
			                  <option>Java </option>
			                  <option>Python</option>
			                  <option>Java Script</option>
		                 </select>
		                 </div>
		                 
		                <div class="form-group">
		                   <label>Select Gender</label>
		                   <div  class="form-check form-check-inline">
			                   <input type="radio" name="gender" value="male"  class="form-check-input" >
			                   <label class="form-check-label" for="inlineRadio1">Male</label>
		                   </div>
		                   
		                    <div  class="form-check form-check-inline">
			                   <input type="radio" name="gender" value="female" class="form-check-input" >
			                   <label class="form-check-label" for="inlineRadio2" >FeMale</label>
		                   </div>
		                 </div>
		                 
		                 <div class="form-group">
		                 <label>Select Type</label>
		                   <select name="type" class="form-control"> 
			                  <option>Regular Student </option>
			                  <option>Ex-Student </option>
		                    </select> 
		                 </div>
		                 
		                 <div class="card">
			                  <div class="card-body">
			                  <p>Address</p>
			                   <div class="form-control">
			                    <!-- refrance Type data handling-->
			                   	 <input type="text" name="address.street" placeholder="Enter Street" class="form-control">
			                     <input type="text" name="address.city" placeholder="Enter City" class="form-control">
			                   </div>
			                  </div>
		                  </div>	
		                  
		                  	                 
		                 <div class="conteiner text-center">
		                    <button type="submit" class="btn btn-primary">SUBMIT</button>
		                 </div>
	                 
	               </form>
	             </div>
	           </div>
	          </div>
           </div>
        
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>