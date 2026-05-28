package caja_de_mercado_central;

public class ProductoCooperativa extends Producto{
	private double porcentajeSinIva=0.9;

	public ProductoCooperativa(Integer _stock, Double _precioBase) {
		super(_stock, _precioBase);
	}
	
	public Double precioTotal() {
		return precioBase*porcentajeSinIva;
	}
	
	

}
