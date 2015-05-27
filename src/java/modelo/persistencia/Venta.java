/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package modelo.persistencia;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Venta")
public class Venta implements Serializable {
	public Venta() {
	}
	
	public static Venta loadVentaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVentaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta getVentaByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getVentaByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVentaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta getVentaByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getVentaByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Venta) session.load(modelo.persistencia.Venta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta getVentaByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Venta) session.get(modelo.persistencia.Venta.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Venta) session.load(modelo.persistencia.Venta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta getVentaByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Venta) session.get(modelo.persistencia.Venta.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVenta(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryVenta(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVenta(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryVenta(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta[] listVentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listVentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta[] listVentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listVentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVenta(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Venta as Venta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVenta(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Venta as Venta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Venta", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta[] listVentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVenta(session, condition, orderBy);
			return (Venta[]) list.toArray(new Venta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta[] listVentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVenta(session, condition, orderBy, lockMode);
			return (Venta[]) list.toArray(new Venta[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta loadVentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Venta[] ventas = listVentaByQuery(session, condition, orderBy);
		if (ventas != null && ventas.length > 0)
			return ventas[0];
		else
			return null;
	}
	
	public static Venta loadVentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Venta[] ventas = listVentaByQuery(session, condition, orderBy, lockMode);
		if (ventas != null && ventas.length > 0)
			return ventas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVentaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateVentaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVentaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateVentaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVentaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Venta as Venta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVentaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Venta as Venta");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Venta", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Venta createVenta() {
		return new modelo.persistencia.Venta();
	}
	
	public boolean save() throws PersistentException {
		try {
			modelo.persistencia.CarSalesSystemPersistentManager.instance().saveObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete() throws PersistentException {
		try {
			modelo.persistencia.CarSalesSystemPersistentManager.instance().deleteObject(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh() throws PersistentException {
		try {
			modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession().refresh(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict() throws PersistentException {
		try {
			modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession().evict(this);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELO_PERSISTENCIA_VENTA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELO_PERSISTENCIA_VENTA_ID_GENERATOR", strategy="identity")	
	private int id;
	
	@ManyToOne(targetEntity=modelo.persistencia.Vehiculo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="idVehiculo", referencedColumnName="id", nullable=false) })	
	private modelo.persistencia.Vehiculo vehiculo;
	
	@ManyToOne(targetEntity=modelo.persistencia.Empleado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="idVendedor", referencedColumnName="id") })	
	private modelo.persistencia.Empleado vendedor;
	
	@ManyToOne(targetEntity=modelo.persistencia.Reservador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="idReservador", referencedColumnName="id", nullable=false) })	
	private modelo.persistencia.Reservador reservador;
	
	@Column(name="estaVendido", nullable=true, length=1)	
	private Integer estaVendido;
	
	@Column(name="fechaVenta", nullable=true, length=10)	
	private String fechaVenta;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setEstaVendido(int value) {
		setEstaVendido(new Integer(value));
	}
	
	public void setEstaVendido(Integer value) {
		this.estaVendido = value;
	}
	
	public Integer getEstaVendido() {
		return estaVendido;
	}
	
	public void setFechaVenta(String value) {
		this.fechaVenta = value;
	}
	
	public String getFechaVenta() {
		return fechaVenta;
	}
	
	public void setVendedor(modelo.persistencia.Empleado value) {
		this.vendedor = value;
	}
	
	public modelo.persistencia.Empleado getVendedor() {
		return vendedor;
	}
	
	public void setReservador(modelo.persistencia.Reservador value) {
		this.reservador = value;
	}
	
	public modelo.persistencia.Reservador getReservador() {
		return reservador;
	}
	
	public void setVehiculo(modelo.persistencia.Vehiculo value) {
		this.vehiculo = value;
	}
	
	public modelo.persistencia.Vehiculo getVehiculo() {
		return vehiculo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
