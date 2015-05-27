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
@Table(name="Reservador")
public class Reservador implements Serializable {
	public Reservador() {
	}
	
	public static Reservador loadReservadorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadReservadorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador getReservadorByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getReservadorByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadReservadorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador getReservadorByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getReservadorByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reservador) session.load(modelo.persistencia.Reservador.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador getReservadorByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Reservador) session.get(modelo.persistencia.Reservador.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reservador) session.load(modelo.persistencia.Reservador.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador getReservadorByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Reservador) session.get(modelo.persistencia.Reservador.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReservador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryReservador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReservador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryReservador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador[] listReservadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listReservadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador[] listReservadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listReservadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryReservador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Reservador as Reservador");
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
	
	public static List queryReservador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Reservador as Reservador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reservador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador[] listReservadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryReservador(session, condition, orderBy);
			return (Reservador[]) list.toArray(new Reservador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador[] listReservadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryReservador(session, condition, orderBy, lockMode);
			return (Reservador[]) list.toArray(new Reservador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadReservadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadReservadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador loadReservadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Reservador[] reservadors = listReservadorByQuery(session, condition, orderBy);
		if (reservadors != null && reservadors.length > 0)
			return reservadors[0];
		else
			return null;
	}
	
	public static Reservador loadReservadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Reservador[] reservadors = listReservadorByQuery(session, condition, orderBy, lockMode);
		if (reservadors != null && reservadors.length > 0)
			return reservadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateReservadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateReservadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateReservadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateReservadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Reservador as Reservador");
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
	
	public static java.util.Iterator iterateReservadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Reservador as Reservador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Reservador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Reservador createReservador() {
		return new modelo.persistencia.Reservador();
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
	@GeneratedValue(generator="MODELO_PERSISTENCIA_RESERVADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELO_PERSISTENCIA_RESERVADOR_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="telefono", nullable=true, length=255)	
	private String telefono;
	
	@Column(name="correo", nullable=true, length=255)	
	private String correo;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setCorreo(String value) {
		this.correo = value;
	}
	
	public String getCorreo() {
		return correo;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
