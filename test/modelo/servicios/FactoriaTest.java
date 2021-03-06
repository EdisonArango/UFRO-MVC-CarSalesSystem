/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.servicios;

import control.util.Utilidades;
import java.util.ArrayList;
import modelo.persistencia.Empleado;
import modelo.persistencia.Vehiculo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pablo
 */
public class FactoriaTest {
    
    public FactoriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of crearVehiculo method, of class Factoria.
     */
//    @Test
//    public void testCrearVehiculo() {
//        System.out.println("crearVehiculo");
//        boolean nuevo = false;
//        String marca = "Chevrolet";
//        String modelo = "Spark";
//        int año = 2015;
//        int kilometraje = 0;
//        int precio = 4000000;
//        int stock = 4;
//        String detalles = "Vehículo nuevo";
//        String[] imagenes = null;
//        String fechaIngreso = "2015/05/01";
//        String expResult = "El vehiculo se ha agregado con éxito";
//        String result = Factoria.crearVehiculo(nuevo, marca, modelo, año, kilometraje, precio, stock, detalles, imagenes, fechaIngreso);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of crearEmpleado method, of class Factoria.
     */
//    @Test
//    public void testCrearEmpleado() {
//        System.out.println("crearEmpleado");
//        String nombre = "Pablo";
//        String usuario = "Valenzuela";
//        String pass = "12345";
//        int tipoUsuario = 0;
//        Factoria instance = new Factoria();
//        String expResult = "Se ha creado empleado con éxito";
//        String result = instance.crearEmpleado(nombre, usuario, pass, tipoUsuario);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }

    /**
     * Test of obtenerVehiculos method, of class Factoria.
     */
//    @Test
//    public void testObtenerVehiculos() {
//        System.out.println("obtenerVehiculos");
//        String busqueda = "";
//        Factoria instance = new Factoria();
//        ArrayList<Vehiculo> expResult = null;
//        ArrayList<Vehiculo> result = instance.obtenerVehiculos(busqueda);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of obtenerVehiculo method, of class Factoria.
//     */
//    @Test
//    public void testObtenerVehiculo() {
//        System.out.println("obtenerVehiculo");
//        int id = 0;
//        Factoria instance = new Factoria();
//        Vehiculo expResult = null;
//        Vehiculo result = instance.obtenerVehiculo(id);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of crearReserva method, of class Factoria.
//     */
//    @Test
//    public void testCrearReserva() {
//        System.out.println("crearReserva");
//        int idVehiculo = 0;
//        String nombreReserv = "Juan";
//        String telefonoReserv = "555555";
//        String correo = "juan@gmail.com";
//        Factoria instance = new Factoria();
//        String expResult = "La reserva se ha realizado con éxito";
//        String result = instance.crearReserva(idVehiculo, nombreReserv, telefonoReserv, correo);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
     @Test
    public void testNuevoVehiculo() {
         int id = Factoria.crearVehiculo();
         System.out.println(id);
         assertTrue(Utilidades.isNumeric(id+""));
    }
    
}
