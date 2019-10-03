<%-- 
    Document   : login.jsp
    Created on : 01/10/2019, 03:05:49 PM
    Author     : Clase
--%>

<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Login</title>

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
    <script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>

    <link rel="stylesheet" type="text/css" href="index.css" th:href="@{/css/index.css}">

</head>
<body>

    <div class="modal-dialog text-center">
        <div class="col-sm-11 main-section">
            <div class="modal-content">
   				<div class="col-12 user-img">
                    <img src="logo1.jpg" th:src="@{/img/user.png}"/>
                </div>
                <div class="col-15 titulo">
                    <h1>Iniciar Sesion</h1>
                </div>
              
                <form class="col-12">
                    <div class="form-group" id="user-group">
                        <input type="text" class="form-control" placeholder="Nombre de usuario" name="username"/>
                    </div>
                    <div class="form-group" id="contrasena-group">
                        <input type="password" class="form-control" placeholder="Contrase�a" name="password"/>
                    </div>
                    <div class="col-12 forgot">
                    	<a href="contrase�a.jsp">�Olvidaste la contrase�a?</a>
            		</div>
                    <a href="otro.html" type="submit" class="btn btn-primary col-12 button" role="button" aria-pressed="true"><i class="fas fa-sign-in-alt"></i> Ingresar</a>
                </form>
                

        	</div>
    	</div>
    </div>	

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>

