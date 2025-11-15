package monedajpa.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Moneda {

	@Id
	private int id;
	
	private Date fechaRegistro;
	private String pais;
	private int anio;
	private double valorNominal;
	private double precioCompra;
	private double valorMercado;
	
	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public String getValorNominal() {
		return valorNominal;
	}
	public void setValorNominal(String valorNominal) {
		this.valorNominal = valorNominal;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getValorMercado() {
		return valorMercado;
	}
	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	//Constructor
	public Moneda(int id, Date fechaRegistro, String pais, int anio, String valorNominal, double precioCompra, double valorMercado) {
		this.id = id;
		this.fechaRegistro = fechaRegistro;
		this.pais = pais;
		this.anio = anio;
		this.valorNominal = valorNominal;
		this.precioCompra = precioCompra;
		this.valorMercado = valorMercado;
	}
	
	//Constructor sin ID
	public Moneda(Date fechaRegistro, String pais, int anio, String valorNominal, double precioCompra, double valorMercado) {
		this.fechaRegistro = fechaRegistro;
		this.pais = pais;
		this.anio = anio;
		this.valorNominal = valorNominal;
		this.precioCompra = precioCompra;
		this.valorMercado = valorMercado;
	}
	
	//Constructor vacio
	public Moneda() {}
	
	//Para mostrar como texto
	@Override
	public String toString() {
		return "Moneda [id=" + id + ", fechaRegistro=" + fechaRegistro + ", pais=" + pais + ", anio=" + anio
				+ ", valorNominal=" + valorNominal + ", precioCompra=" + precioCompra + ", valorMercado=" + valorMercado
				+ "]";
	}
		
}
