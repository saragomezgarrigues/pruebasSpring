<%@include file="/resources/templates/header.jsp" %>
<h2>Formulario de registro de Personas</h2>
<form method="post">
	<label>Nombre: </label>
	<input type="text" name="nombrePersona" placeholder="Recuerda escribir tu nombre completo" autofocus><br>
	<label>Apellidos: </label>
	<input type="text" name="apellidosPersona" placeholder="Escribe tus apellidos"><br>
	<fieldset>
		<legend>Procedencia</legend>
		<label>Pais de procedencia: </label>
		<input type="text" name="paisPersona"><br>
		<label>Contiente: </label>
		<select name="contiente">
			<option value="europa">Europa</option>
			<option value="america">Am&eacute;rica</option>
			<option value="africa">Africa</option>
			<option value="oceania">Ocean&iacute;a</option>
			<option value="asia">Asia</option>
		</select>
	</fieldset><br>
	<input type="submit" value="Registrar persona">
	<input type="reset" value="Limpiar Formulario">
</form>
<%@include file="/resources/templates/footer.jsp" %>