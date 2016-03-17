<%@include file="/resources/templates/header.jsp" %>
<h2>---DATOS REGISTRADOS CORRECTAMENTE--</h2>
<fieldset>
	<legend>Datos del interesad@</legend>
<p>Nombre del interesa@: ${persona.nombrePersona}</p>
<p>Apellidos del interesad@: ${persona.apellidosPersona}</p>
<p>Pais de procedencia: ${persona.pais.nombre}</p>
<p>Continente donde se ecnuenra el pais: ${persona.pais.continente}</p>
</fieldset>
<%@include file="/resources/templates/footer.jsp" %>