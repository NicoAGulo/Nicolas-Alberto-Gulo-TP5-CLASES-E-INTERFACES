package caja_de_mercado_central;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CajaTest {
	Caja caja;
	
	Producto arrozFino;
	Producto polenta;
	
	ProductoCooperativa fideosCooperativa;
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		
		arrozFino = new Producto(20, 1200.00);
		polenta = new Producto(15, 1000.00);
		
		fideosCooperativa= new ProductoCooperativa(10, 1000.00);
	}

	@Test
	public void testCajaRegistraProducto() {
		caja.registrarProducto(arrozFino);
		
		assertTrue(caja.productosRegistrados().contains(arrozFino));
		assertEquals(19,arrozFino.stock());
	}
	
	@Test
	public void testProductoCooperativa() {
		caja.registrarProducto(fideosCooperativa);
		
		assertTrue(caja.productosRegistrados().contains(fideosCooperativa));
		
		assertEquals(9, fideosCooperativa.stock());
		
		//1000 menos el 10%= 900
		assertEquals(900, fideosCooperativa.precioTotal());
	}
	
	@Test
	public void testTotalProductosRegistrados() {
		caja.registrarProducto(arrozFino);
		caja.registrarProducto(fideosCooperativa);
		
		//1200+900=2100
		assertEquals(2100, caja.sumaPreciosProductosRegistrados());
	}
	

}
