package caja_de_mercado_central;

import java.util.ArrayList;

public class Caja {
	private ArrayList<Producto> productosRegistrados;
	
	public Caja() {
		this.productosRegistrados = new ArrayList<Producto>();
	}
	
	public void registrarProducto(Producto _producto) {
		productosRegistrados.add(_producto);
		_producto.decrementarStock();
	}
	
	public ArrayList<Producto> productosRegistrados() {
		return productosRegistrados;
	}

	public Double sumaPreciosProductosRegistrados() {
		return productosRegistrados.stream().mapToDouble(p -> p.precioTotal()).sum();
	}
}
