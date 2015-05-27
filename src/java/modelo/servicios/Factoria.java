package modelo.servicios;

import java.util.ArrayList;
import modelo.persistencia.Vehiculo;
import org.orm.PersistentException;

public class Factoria {

	public String crearVehiculo(boolean nuevo, String marca, String modelo, int año, int kilometraje, int precio, int stock, String fechaIngreso) {
            try {
                Vehiculo vehiculoNuevo = Vehiculo.createVehiculo();
                if (nuevo) {
                    vehiculoNuevo.setNuevo(1);
                    vehiculoNuevo.setKilometraje(0);
                    vehiculoNuevo.setStock(stock);
                }
                else{
                    vehiculoNuevo.setNuevo(0);
                    vehiculoNuevo.setKilometraje(kilometraje);
                }
                vehiculoNuevo.setMarca(marca);
                vehiculoNuevo.setModel(modelo);
                vehiculoNuevo.setAño(año);
                vehiculoNuevo.setPrecio(precio);
                vehiculoNuevo.setFechaIngreso(fechaIngreso);

                vehiculoNuevo.save();
                return "El vehiculo se ha agregado con éxito";
            } catch (PersistentException e) {
                return "Error al intentar agregar el vehículo";
            }
                
	}

	public String crearEmpleado(String nombre, String usuario, String pass, int tipoUsuario) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vehiculo> obtenerVehiculos(String busqueda) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo obtenerVehiculo(int id) {
		throw new UnsupportedOperationException();
	}

	public String crearReserva(int idVehiculo, String nombreReserv, String telefonoReserv, String correo) {
		throw new UnsupportedOperationException();
	}
}