package monedajpa.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import monedajpa.entidades.Moneda;

@Stateless
public class MonedaEJB implements EJBMonedaLocal{

	//Para crear el Entity Manager, y luego usar el persist 
	@PersistenceContext(unitName = "MonedaJPAEJB")
	private EntityManager em;
	
	@Override
	public List<Moneda> obtenerTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void agregar(Moneda moneda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Moneda moneda) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Moneda moneda) {
		// TODO Auto-generated method stub
		
	}

	
}
