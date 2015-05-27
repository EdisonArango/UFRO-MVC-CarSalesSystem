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
@Table(name="Imagen")
public class Imagen implements Serializable {
	public Imagen() {
	}
	
	public static Imagen loadImagenByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadImagenByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen getImagenByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getImagenByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadImagenByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen getImagenByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return getImagenByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Imagen) session.load(modelo.persistencia.Imagen.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen getImagenByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Imagen) session.get(modelo.persistencia.Imagen.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Imagen) session.load(modelo.persistencia.Imagen.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen getImagenByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Imagen) session.get(modelo.persistencia.Imagen.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagen(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryImagen(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagen(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return queryImagen(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen[] listImagenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listImagenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen[] listImagenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return listImagenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryImagen(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Imagen as Imagen");
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
	
	public static List queryImagen(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Imagen as Imagen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Imagen", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen[] listImagenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryImagen(session, condition, orderBy);
			return (Imagen[]) list.toArray(new Imagen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen[] listImagenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryImagen(session, condition, orderBy, lockMode);
			return (Imagen[]) list.toArray(new Imagen[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadImagenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return loadImagenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen loadImagenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Imagen[] imagens = listImagenByQuery(session, condition, orderBy);
		if (imagens != null && imagens.length > 0)
			return imagens[0];
		else
			return null;
	}
	
	public static Imagen loadImagenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Imagen[] imagens = listImagenByQuery(session, condition, orderBy, lockMode);
		if (imagens != null && imagens.length > 0)
			return imagens[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateImagenByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateImagenByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImagenByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = modelo.persistencia.CarSalesSystemPersistentManager.instance().getSession();
			return iterateImagenByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateImagenByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Imagen as Imagen");
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
	
	public static java.util.Iterator iterateImagenByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From modelo.persistencia.Imagen as Imagen");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Imagen", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Imagen createImagen() {
		return new modelo.persistencia.Imagen();
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
	@GeneratedValue(generator="MODELO_PERSISTENCIA_IMAGEN_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="MODELO_PERSISTENCIA_IMAGEN_ID_GENERATOR", strategy="increment")	
	private int id;
	
	@Column(name="ruta", nullable=true, length=1000)	
	private String ruta;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setRuta(String value) {
		this.ruta = value;
	}
	
	public String getRuta() {
		return ruta;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
