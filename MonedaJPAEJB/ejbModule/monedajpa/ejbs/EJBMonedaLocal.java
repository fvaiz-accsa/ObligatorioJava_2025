package monedajpa.ejbs;

import java.util.List;

import javax.ejb.Local;

import monedajpa.entidades.Moneda;

@Local
public interface EJBMonedaLocal {
	
	List<Moneda> obtenerTodas();
	
	void agregar(Moneda moneda);
	
	void modificar(Moneda moneda);
	
	void eliminar(Moneda moneda);
}
