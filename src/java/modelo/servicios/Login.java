package modelo.servicios;

import modelo.persistencia.Empleado;
import org.orm.PersistentException;

public class Login {

	public static Empleado iniciarSesion(String usuario, String pass) throws PersistentException {
            Empleado empleado = Empleado.loadEmpleadoByQuery("usuario='"+usuario+"' and password='"+pass+"'", null);
            return empleado;
	}
}