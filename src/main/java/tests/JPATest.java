package tests;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import model.Cliente;
import model.Cuenta;
import model.Movimiento;
import model.Rol;
import model.TipoCuenta;


public class JPATest {
	
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction tx = manager.getTransaction();
		
		tx.begin();
		
		
		Cliente cliente = new Cliente();
		cliente.setNombres("Antony");
		cliente.setApellidoPaterno("Figueroa");
		cliente.setApellidoMaterno("Briceño");
		
		Cuenta cuenta = new Cuenta();
		cuenta.setNumeroCuenta("12345678990");
		cuenta.setSaldo(2000);
		cuenta.setActiva(true);
		
		cliente.setCuenta(cuenta);
		TipoCuenta.setCuenta(cuenta);
		
		Movimiento movimiento = new Movimiento();
		movimiento.setDescripcion("Nuevo Deposito");
		movimiento.setFecha(LocalDate.now());
		movimiento.setMonto(600);
		
		cuenta.setMovimiento(movimiento);
		
		Rol rol = new Rol();
		rol.setDescripcion("Titular");
		rol.setActivo(true);
		
		List<Rol> roles = Arrays.asList(rol); 
		cliente.setRol(roles);
		
		
		
		TipoCuenta tipoCuenta = new TipoCuenta();
		tipoCuenta.setDescripcion("Cuenta Ahorros");
		tipoCuenta.setMoneda("SOLES");
		
		
		
	
		
		//INSERTAR
		
		manager.persist(cliente);
		
		tx.commit();
		
		List<Cliente> lista = manager.createQuery("from Cliente",Cliente.class).getResultList();
		for (Cliente cl :lista) {
			System.out.println(cl);
		}
		
	}

}
