<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/head.jsp"%>
<%@include file="Components/bodyPrimeraParte.jsp"%>

<h1>Alta usuarios</h1>
<p>Este es el apartado para dar de alta a los diferentes usuarios del sistema</p>

<form class="user" action="SVUsuarios" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                                            placeholder="Nombre de usuario">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="Contraseña">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="Rol">
                                    </div>
                                    
                                   
                                    
                                    <!-- Aquí irán horarios y usuarios-->
                                </div>
                                <div class="col-sm-6 mb-3">
                                    <button class="btn btn-primary btn-user btn-group" type="submit">
                                    Crear usuario
                                    </button>
                                </div>
                                
                            </form>

<%@include file="Components/bodyFinal.jsp"%> 

   
