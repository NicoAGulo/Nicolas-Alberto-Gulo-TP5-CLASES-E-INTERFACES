package caja_de_mercado_central;

public class Producto implements StockDecrementable, PrecioCalculable{
	double precioBase;
	Integer stock;
	
	public Producto(Integer _stock, Double _precioBase) {
		this.stock = _stock;
		this.precioBase = _precioBase;
	}

	@Override
	public Double precioTotal() {
		return precioBase;
	}

	@Override
	public void decrementarStock() {
		stock-=1;		
	}
	
	public Integer stock() {
		return stock;
	}
}
