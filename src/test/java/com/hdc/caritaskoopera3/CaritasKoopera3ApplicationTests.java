package com.hdc.caritaskoopera3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hdc.caritaskoopera3.modelos.CentroVO;
import com.hdc.caritaskoopera3.modelos.EmpleadoVO;
import com.hdc.caritaskoopera3.modelos.PersonaVO;
import com.hdc.caritaskoopera3.modelos.ProductoVO;
import com.hdc.caritaskoopera3.modelos.SeccionVO;
import com.hdc.caritaskoopera3.modelos.VentaVO;
import com.hdc.caritaskoopera3.services.ServiceCentro;
import com.hdc.caritaskoopera3.services.ServiceEmpleado;
import com.hdc.caritaskoopera3.services.ServicePersona;
import com.hdc.caritaskoopera3.services.ServiceProducto;
import com.hdc.caritaskoopera3.services.ServiceSeccion;
import com.hdc.caritaskoopera3.services.ServiceVenta;




@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CaritasKoopera3ApplicationTests {
	
	@Autowired
	ServicePersona sp;
	
	@Autowired
	ServiceEmpleado se;
	
	@Autowired
	ServiceCentro sc;
	
	@Autowired
	ServiceSeccion secrep;
	
	@Autowired
	ServiceProducto prodr;
	
	@Autowired
	ServiceVenta vr;
	
	
	@Test
	@Order(1)
	public void insertarpersona() {
		sp.save(new PersonaVO(0, "Héctor del Campo", "535339295x", "647924924", "hjaviercr49@educastur.es", "Rio sella 18, 1º izda, 33210, gijon"));
		sp.save(new PersonaVO(0, "Cármen Vazquez", "10823577f", "636925438", "c.vazquez49@educastur.es", "Periodista Adeflor, 42, 3º izda, 33450, Llanera"));
		assertNotNull(sp.save(new PersonaVO(0, "Juan de la cosa", "535339296j", "647924928", "hjavierc52@educastur.es", "Rio sella 18, 1º izda, 33210, gijon")));
	}
	
	@Test
	@Order(2)
	public void insertarempleado() {
		se.save(new EmpleadoVO(0, "Encargado", "Gijon", LocalDate.of(2012, 03, 10), 1, false, sp.findById(2).get()));
		se.save(new EmpleadoVO(0, "Dependient@", "Gijon", LocalDate.of(2021, 01, 03), 1, true, sp.findById(3).get()));
		assertNotNull(se.save(new EmpleadoVO(0, "Encargado", "Gijon", LocalDate.of(2010, 05, 25), 2, false, sp.findById(1).get())));
	}
	
	@Test
	@Order(3)
	public void recuperarPersonaPorEmpleado() {
		assertEquals("Cármen Vazquez", se.findById(1).get().getPersonas().getNombrecompleto());
	}
	
	@Test
	@Order(4)
	public void insertarCentro() {
		assertNotNull(sc.save(new CentroVO(0,"Koopera Store Gijón", "Uria 32, Gijón", "985392786", "storegijon@koopera.org", 800, LocalDate.of(2021, 02, 01), se.findById(1).get())));
	}
	
	@Test
	@Order(5)
	public void insertSeccion() {
		secrep.save(new SeccionVO(0, "Mujer"));
		secrep.save(new SeccionVO(0, "Hombre"));
		secrep.save(new SeccionVO(0, "Niño"));
		secrep.save(new SeccionVO(0, "Bebe"));
		assertNotNull(secrep.save(new SeccionVO(0, "Zapatos")));
	}
	
	@Test
	@Order(6)
	public void insertarProducto() {
		prodr.save(new ProductoVO(0, "040114028", 3.99, "Zapato Mujer"));
		prodr.save(new ProductoVO(0, "040214028", 4.99, "Zapato Hombre"));
		prodr.save(new ProductoVO(0, "040314028", 2.0, "Zapato Niño"));
		prodr.save(new ProductoVO(0, "040414028", 2.0, "Zapato Bebe"));
		assertEquals(4, prodr.findById(4).get().getIdproducto());
	}
	
	@Test
	@Order(7)
	public void insertarVenta() {
		VentaVO venta = new VentaVO();
		venta.setIdventa(0);
		venta.setCantidad(2);
		venta.setProductos(prodr.findById(1).get());
		vr.save(venta);
		vr.save(new VentaVO(0, 2, prodr.findById(1).get()));
		assertEquals(1, vr.findById(1).get().getIdventa());
	}
}
