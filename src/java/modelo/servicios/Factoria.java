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

        public static int crearVehiculo(){
            Vehiculo vehiculoNuevo = Vehiculo.createVehiculo();
            return vehiculoNuevo.getId();
        }
        
	public static String crearVehiculo(int id,boolean nuevo, String marca, String modelo, int año,
                int kilometraje, int precio, int stock, String detalles,String[] imagenes,String fechaIngreso) {
            try {
                Vehiculo vehiculoNuevo=null;
                if(id==-1){
                    vehiculoNuevo = Vehiculo.createVehiculo();
                }
                else{
                    vehiculoNuevo = Vehiculo.loadVehiculoByQuery("id="+id, null);
                }
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
                return "Se ha creado empleado con éxito";
            } catch (PersistentException ex) {
                return "Error al ingresar empleado";
            }
       }

	public Vehiculo[] obtenerVehiculos(String busqueda) throws PersistentException {
        
            return Vehiculo.listVehiculoByQuery(null, null);
                                
	}

	public Vehiculo obtenerVehiculo(int id) {
            try {
                Vehiculo vehiculo = Vehiculo.loadVehiculoByORMID(id);
                if(vehiculo!=null){
                    return vehiculo;
                }
                else{
                    return null;
                }
            } catch (PersistentException ex) {
                Logger.getLogger(Factoria.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
	}

	public String crearReserva(int idVehiculo, String nombreReserv, String telefonoReserv, String correo) {
                     
        Reservador reserva = Reservador.createReservador();
        //si reserva no existe, entonces se crea
        //sino, mensaje indicando que ya existe!.
        if(reserva!=null){
            try {
                reserva.setNombre(nombreReserv);
                reserva.setTelefono(telefonoReserv);
                reserva.setCorreo(correo);
                reserva.save();
                return "La reserva se ha realizado con éxito";
             } catch (PersistentException ex) {
                return "Error al realizar reserva";
             }
        }else{
            return "La reserva ya existe!!";
        }
	}
}