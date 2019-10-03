<%-- 
    Document   : contraseña.jsp
    Created on : 01/10/2019, 03:46:59 PM
    Author     : Clase
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Recuperar Contraseña</title>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

    <link rel="stylesheet" type="text/css" href="contraseña.css" th:href="@{/css/contraseña.css}">

</head>
<body>
	
    <div class="modal-dialog text-center">
        <div class="col-sm-11 main-section">
            <div class="modal-content">
   				<div class="col-12 user-img">
                    <img src="logo1.jpg" th:src="@{/img/user.png}"/>
                </div>

                <div class="col-15 titulo">
                	<h2>Restablecer su Contraseña</h2>
                </div>
              
                <form class="col-12">

                	<div class="col-12 forgot">
                    	<p>Ingrese su direccion de correo electronico y le enviaremos un enlace para restablecer su contraseña</p>
            		</div>
                
                    <div class="form-group" id="correo-group">
                        <input type="password" class="form-control" placeholder="Email" name="password"/>
                    </div>
                    
                    <button type="submit" class="btn btn-primary"><i class="fas fa-sign-in-alt"></i> Enviar </button>
                </form>
                
        	</div>
    	</div>
    </div>





<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>