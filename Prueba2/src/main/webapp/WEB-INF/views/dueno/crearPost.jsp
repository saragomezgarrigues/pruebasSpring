<%@include file="/resources/templates/header.jsp" %>
<h2>Datos registrados correctamente</h2>
<p>Nombre del dueño: ${dueno.nombreDueno}</p>
<p>Apellidos del dueño: ${dueno.apellidosDueno}</p>
<p>Teléfono del dueño: ${dueno.telefonoDueno}</p>
<p>Email del dueno: ${dueno.emailDueno}</p>
<fieldset>
	<legend>Datos de su mascota</legend>
	<p>Nombre de la mascota: ${dueno.mascota.nombreMascota}</p>
	<p>Tipo de mascota: ${dueno.mascota.tipoMascota}</p>
	<p>Genero de la mascota: ${dueno.mascota.generoMascota}</p>
</fieldset>
<%@include file="/resources/templates/footer.jsp" %>