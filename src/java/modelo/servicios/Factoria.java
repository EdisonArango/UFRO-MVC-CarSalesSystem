package modelo.servicios;

import control.util.Utilidades;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.persistencia.Empleado;
import modelo.persistencia.Imagen;
import modelo.persistencia.Reservador;
import modelo.persistencia.Vehiculo;
import modelo.persistencia.Venta;
import org.orm.PersistentException;

public class Factoria {

        public static int crearVehiculo(){
            Vehiculo vehiculoNuevo = Vehiculo.createVehiculo();
            return vehiculoNuevo.getId();
        }
        
	public static String crearVehiculo(int id,boolean nuevo, String marca, String modelo, int año,
                int kilometraje, int precio, int stock, String detalles,String[] imagenes) {
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
                    vehiculoNuevo.setStock(1);
                }
                vehiculoNuevo.setMarca(marca);
                vehiculoNuevo.setModel(modelo);
                vehiculoNuevo.setAño(año);
                vehiculoNuevo.setPrecio(precio);
                vehiculoNuevo.setDetalles(detalles);
                vehiculoNuevo.setFechaIngreso(Utilidades.fechaActual());
                
                if(imagenes!=null){
                    for (String imagen : imagenes) {
                        Imagen nuevaImagen = Imagen.createImagen();
                        nuevaImagen.setRuta(imagen);
                        vehiculoNuevo.imagenes.add(nuevaImagen);
                    }
                }
                vehiculoNuevo.save();
                return "El vehiculo se ha agregado con éxito";
            } catch (PersistentException e) {
                return "Error al intentar agregar el vehículo";
            }
                
	}

	public static String crearEmpleado(String nombre, String usuario, String pass, int tipoUsuario) {
            try {
                Empleado empleadoNuevo = Empleado.createEmpleado();
                // tipoUsuario = 0, si Usuario es Administrador
                // tipoUsuario = 1, si Usuario es Vendedor
                empleadoNuevo.setTipoUsuario(tipoUsuario);
                empleadoNuevo.setNombre(nombre);
                empleadoNuevo.setPassword(pass);
                empleadoNuevo.setUsuario(usuario);
                empleadoNuevo.save();
                return "Se ha creado el empleado con éxito";
            } catch (PersistentException ex) {
                return "Error al ingresar empleado";
            }
       }

	public static Vehiculo[] obtenerVehiculos(String busqueda) throws PersistentException {
        
            return Vehiculo.listVehiculoByQuery(null, null);
                                
	}

	public static Vehiculo obtenerVehiculo(String id) {
            try {
                Vehiculo vehiculo = Vehiculo.loadVehiculoByQuery("id="+id, null);
                return vehiculo;
            } catch (PersistentException ex) {
                return null;
            }
	}
        
        public static boolean eliminarReserva(String id) {
            try {
                Venta venta = Venta.loadVentaByQuery("id="+id, null);
                venta.getVehiculo().setStock(venta.getVehiculo().getStock()+1);
                venta.getVehiculo().save();
                venta.delete();
                return true;
            } catch (PersistentException ex) {
                return false;
            }
	}
        
        public static boolean venderVehiculo(String idVenta,String idEmpleado) {
            try {
                Venta venta = Venta.loadVentaByQuery("id="+idVenta, null);
                System.out.println("IdEmpleado:"+idEmpleado);
                venta.setVendedor(Empleado.loadEmpleadoByQuery("id="+idEmpleado, null));
                venta.setEstaVendido(1);
                venta.setFechaVenta(Utilidades.fechaActual());
                venta.save();
                return true;
            } catch (PersistentException ex) {
                return false;
            }
	}

	public static String crearReserva(int idVehiculo, String nombreReserv, String telefonoReserv, String correo) {
            try {
                Venta venta = Venta.createVenta();
                venta.setEstaVendido(0);
                Vehiculo vehiculo = obtenerVehiculo(idVehiculo+"");
                if (vehiculo.getStock()==0) {
                    return "Este vehiculo no esta disponible en el momento";
                }
                venta.setVehiculo(vehiculo);
                Reservador reserva = Reservador.createReservador();
                reserva.setNombre(nombreReserv);
                reserva.setTelefono(telefonoReserv);
                reserva.setCorreo(correo);
                reserva.save();
                venta.setReservador(reserva);
                venta.save();
                vehiculo.setStock(vehiculo.getStock()-1);
                vehiculo.save();
                return "La reserva se ha realizado con éxito";
            } catch (PersistentException ex) {
                return "Error al realizar reserva";
            }
	}
        
        public static Venta[] obtenerReservas() throws PersistentException{  
            return Venta.listVentaByQuery("estaVendido=0", null);
        }
        
        public static boolean eliminarVehiculo(String id){
            try {
                Vehiculo vehiculo = Vehiculo.loadVehiculoByQuery("id="+id, null);
                vehiculo.delete();
                return true;
            } catch (PersistentException ex) {
                return false;
            }
        }
}