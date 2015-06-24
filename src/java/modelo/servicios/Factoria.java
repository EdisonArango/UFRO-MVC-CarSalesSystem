package modelo.servicios;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.persistencia.Empleado;
import modelo.persistencia.Imagen;
import modelo.persistencia.Reservador;
import modelo.persistencia.Vehiculo;
import org.orm.PersistentException;

public class Factoria {

	public static String crearVehiculo(boolean nuevo, String marca, String modelo, int año, int kilometraje, int precio, int stock, String detalles,String[] imagenes,String fechaIngreso) {
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
                vehiculoNuevo.setDetalles(detalles);
                vehiculoNuevo.setFechaIngreso(fechaIngreso);
                
                if(imagenes!=null){
                    for (int i = 0; i < imagenes.length; i++) {
                        Imagen nuevaImagen = Imagen.createImagen();
                        nuevaImagen.setRuta(imagenes[i]);
                        vehiculoNuevo.imagenes.add(nuevaImagen);
                    }
                }
                vehiculoNuevo.save();
                return "El vehiculo se ha agregado con éxito";
            } catch (PersistentException e) {
                return "Error al intentar agregar el vehículo";
            }
                
	}

	public String crearEmpleado(String nombre, String usuario, String pass, int tipoUsuario) {
            try {
                Empleado empleadoNuevo = Empleado.createEmpleado();
                // tipoUsuario = 0, si Usuario es Administrador
                // tipoUsuario = 1, si Usuario es Vendedor
                if (tipoUsuario==0){
                    empleadoNuevo.setTipoUsuario(0);
                }
                else if(tipoUsuario==1){
                    empleadoNuevo.setTipoUsuario(1);
                }
                empleadoNuevo.setNombre(nombre);
                empleadoNuevo.setPassword(pass);
                empleadoNuevo.setUsuario(usuario);
                empleadoNuevo.save();
                return "Se ha agregado empleado con éxito";
            } catch (PersistentException ex) {
                return "Error al ingresar empleado";
            }
       }

	public ArrayList<Vehiculo> obtenerVehiculos(String busqueda) {
		throw new UnsupportedOperationException();
	}

	public Vehiculo obtenerVehiculo(int id) {
		throw new UnsupportedOperationException();
	}

//	public String crearReserva(int idVehiculo, String nombreReserv, String telefonoReserv, String correo) {
////        Reservador nuevaReserva = Reservador.createReservador();
////             if(nuevaReserva!=null){
////                nuevaReserva.setNombre(nombreReserv);
////                nuevaReserva.setTelefono(telefonoReserv);
////                nuevaReserva.setCorreo(correo);
////                 try {
////                     nuevaReserva.save();
////                 } catch (PersistentException ex) {
////                     Logger.getLogger(Factoria.class.getName()).log(Level.SEVERE, null, ex);
////                 }
////                return "La reserva se ha realizado con éxito";
////             }else{
////                 return "La reserva ya existe!!";
////             }
//	}
}