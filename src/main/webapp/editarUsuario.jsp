<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/head.jsp"%>
<%@include file="Components/bodyPrimeraParte.jsp"%>

<h1>Edición de usuarios</h1>
<p>Este es el apartado para modificar un usuario del sistema</p>

<%-- Traemos usuario de la sesión --%>
<% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");%>

<form class="user" action="SVEditarUsuarios" method="POST">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombreUsu" name="nombreUsu"
                                            placeholder="Nombre de usuario" value="<%=usu.getNombre_usuario()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="password" class="form-control form-control-user" id="contrasenia" name="contrasenia"
                                            placeholder="Contraseña" value="<%=usu.getContrasenia()%>">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="rol" name="rol"
                                            placeholder="Rol" value= "<%=usu.getRol()%>" >
                                    </div>
                                    
                                   
                                    
                                    <!-- Aquí irán horarios y usuarios-->
                                </div>
                                <div class="col-sm-6 mb-3">
                                    <button class="btn btn-primary btn-user btn-group" type="submit">
                                    Actualizar
                                    </button>
                                </div>
                                
                            </form>

<%@include file="Components/bodyFinal.jsp"%> 
