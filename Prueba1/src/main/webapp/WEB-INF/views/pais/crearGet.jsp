<%@include file="/resources/templates/header.jsp" %>
<form method="post">
	<fieldset>
		<legend>Datos del pais</legend>
		<label>Nombre del pais: </label>
		<input type="text" name="nombrePais" placeholder="Escribe el nombre completo!" autofocus><br>
		<label>Contiente: </label>
		<select name="continente">
			<option value="europa">Europa</option>
			<option value="america">Am&eacute;rica</option>
			<option value="africa">Africa</option>
			<option value="oceania">Ocean&iacute;a</option>
			<option value="asia">Asia</option>
		</select><br>
		<input type="submit" value="Registrar Pais">
		<input type="reset" value="Limpiar Formulario">
	</fieldset>
</form>
<%@ include file="/resources/templates/footer.jsp"%>