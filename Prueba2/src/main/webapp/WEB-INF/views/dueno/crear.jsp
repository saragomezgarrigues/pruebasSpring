<%@include file="/resources/templates/header.jsp" %>
<fieldset>
	<legend>Formulario de registro de Dueños</legend>
	<form method="post">
		<label>Nombre del dueño: </label>
		<input type="text" name="nombreDueno" placeholder="Escribe tu nombre completo" required autofocus><br>
		<label>Apellidos del dueño: </label>
		<input type="text" name="apellidoDueno" placeholder="Escribe tus apellidos"><br>
		<label>Telefono: </label>
		<input type="text" name="telefonoDueno"><br>
		<label>Correo Electronico: </label>
		<input type="text" name="emailDueno"><br>
		<fieldset>
			<legend>Datos de tu mascota</legend>
		<label>Nombre de la mascota: </label>
		<input type="text" name="nombreMascota" required><br>
		<label>Tipo de mascota: </label>
		<select name="tipoMascota">
			<option value="perro">Perro</option>
			<option value="gato">Gato</option>
			<option value="canario">Canario</option>
			<option value="hamster">Hamster</option>
			<option value="chichilla">Chinchilla</option>
		</select><br>
		<label>Genero: </label>
		<label>&male;</label><input type="radio" name="generoMascota" value="&male;">
		<label>&female;</label><input type="radio" name="generoMascota" value="&female;"><br>
</fieldset>
	<input type="submit" value="Registrar Dueño">
	<input type="reset" value="Limpiar Formulario">
</form>
</fieldset>
<%@include file="/resources/templates/footer.jsp" %>