<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Components/head.jsp"%>
<%@include file="Components/bodyPrimeraParte.jsp"%>

<h1>Alta odontólogos</h1>

<form class="user">
                                <div class="form-group col">
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="dni"
                                            placeholder="DNI">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="nombre"
                                            placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="apellidos"
                                            placeholder="Apellidos">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="telefono"
                                            placeholder="Teléfono">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="direccion"
                                            placeholder="Dirección">
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="fechaNac"
                                            placeholder="Fecha de nacimiento">
                                  
                                    </div>
                                    <div class="col-sm-6 mb-3">
                                        <input type="text" class="form-control form-control-user" id="especialidad"
                                            placeholder="Especialidad">
                                    </div>
                                    
                                    <!-- Aquí irán horarios y usuarios-->
                                </div>
                                <div class="col-sm-6 mb-3">
                                    <a href="#" class="btn btn-primary btn-user btn-group">
                                    Crear odontólogo
                                </a>
                                </div>
                                
                            </form>

<%@include file="Components/bodyFinal.jsp"%> 

   