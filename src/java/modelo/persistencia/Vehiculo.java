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
@Table(name="Vehiculo")
public class Vehiculo implements Serializable {
	public Vehiculo() {
	}
	
	public static Vehiculo loadVehiculoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVehiculoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo getVehiculoByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getVehiculoByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVehiculoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo getVehiculoByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getVehiculoByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Vehiculo) session.load(modelo.persistencia.Vehiculo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo getVehiculoByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Vehiculo) session.get(modelo.persistencia.Vehiculo.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vehiculo) session.load(modelo.persistencia.Vehiculo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo getVehiculoByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Vehiculo) session.get(modelo.persistencia.Vehiculo.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVehiculo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryVehiculo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVehiculo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryVehiculo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo[] listVehiculoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listVehiculoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo[] listVehiculoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listVehiculoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryVehiculo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Vehiculo as Vehiculo");
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
	
	public static List queryVehiculo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Vehiculo as Vehiculo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vehiculo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo[] listVehiculoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryVehiculo(session, condition, orderBy);
			return (Vehiculo[]) list.toArray(new Vehiculo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo[] listVehiculoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryVehiculo(session, condition, orderBy, lockMode);
			return (Vehiculo[]) list.toArray(new Vehiculo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVehiculoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadVehiculoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo loadVehiculoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Vehiculo[] vehiculos = listVehiculoByQuery(session, condition, orderBy);
		if (vehiculos != null && vehiculos.length > 0)
			return vehiculos[0];
		else
			return null;
	}
	
	public static Vehiculo loadVehiculoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Vehiculo[] vehiculos = listVehiculoByQuery(session, condition, orderBy, lockMode);
		if (vehiculos != null && vehiculos.length > 0)
			return vehiculos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateVehiculoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateVehiculoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVehiculoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateVehiculoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateVehiculoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Vehiculo as Vehiculo");
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
	
	public static java.util.Iterator iterateVehiculoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Vehiculo as Vehiculo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Vehiculo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Vehiculo createVehiculo() {
		return new modelo.persistencia.Vehiculo();
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
	
	private java.util.Set this_getSet (int key) {
		if (key == modelo.persistencia.ORMConstants.KEY_VEHICULO_IMAGENES) {
			return ORM_imagenes;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="id", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="MODELO_PERSISTENCIA_VEHICULO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELO_PERSISTENCIA_VEHICULO_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="marca", nullable=true, length=255)	
	private String marca;
	
	@Column(name="modelo", nullable=true, length=255)	
	private String model;
	
	@Column(name="año", nullable=true, length=4)	
	private Integer año;
	
	@Column(name="kilometraje", nullable=true, length=10)	
	private Integer kilometraje;
	
	@Column(name="precio", nullable=true, length=10)	
	private Integer precio;
	
	@Column(name="stock", nullable=true, length=5)	
	private Integer stock;
	
	@Column(name="nuevo", nullable=true, length=1)	
	private Integer nuevo;
	
	@Column(name="fechaIngreso", nullable=true, length=10)	
	private String fechaIngreso;
	
        @Column(name="detalles", nullable=true, length=3000)	
	private String detalles;
        
	@OneToMany(targetEntity=modelo.persistencia.Imagen.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="idVehiculo", nullable=false) })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_imagenes = new java.util.HashSet();
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setMarca(String value) {
		this.marca = value;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setModel(String value) {
		this.model = value;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setAño(int value) {
		setAño(new Integer(value));
	}
	
	public void setAño(Integer value) {
		this.año = value;
	}
	
	public Integer getAño() {
		return año;
	}
	
	public void setKilometraje(int value) {
		setKilometraje(new Integer(value));
	}
	
	public void setKilometraje(Integer value) {
		this.kilometraje = value;
	}
	
	public Integer getKilometraje() {
		return kilometraje;
	}
	
	public void setPrecio(int value) {
		setPrecio(new Integer(value));
	}
	
	public void setPrecio(Integer value) {
		this.precio = value;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	
	public void setStock(int value) {
		setStock(new Integer(value));
	}
	
	public void setStock(Integer value) {
		this.stock = value;
	}
	
	public Integer getStock() {
		return stock;
	}
	
	public void setNuevo(int value) {
		setNuevo(new Integer(value));
	}
	
	public void setNuevo(Integer value) {
		this.nuevo = value;
	}
	
	public Integer getNuevo() {
		return nuevo;
	}
	
	public void setFechaIngreso(String value) {
		this.fechaIngreso = value;
	}
	
	public String getFechaIngreso() {
		return fechaIngreso;
	}
        
        public void setDetalles(String value) {
		this.detalles = value;
	}
	
	public String getDetalles() {
		return detalles;
	}
	
	private void setORM_Imagenes(java.util.Set value) {
		this.ORM_imagenes = value;
	}
	
	private java.util.Set getORM_Imagenes() {
		return ORM_imagenes;
	}
	
	@Transient	
	public final modelo.persistencia.ImagenSetCollection imagenes = new modelo.persistencia.ImagenSetCollection(this, _ormAdapter, modelo.persistencia.ORMConstants.KEY_VEHICULO_IMAGENES, modelo.persistencia.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
