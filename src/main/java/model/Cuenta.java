package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cuenta")
@Entity(name = "cuenta")
@Getter
@Setter

public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "activa"  , nullable = false)
	private boolean activa;
	
	@Column(name = "saldo", length = 100, nullable = false)
	private double saldo;
	
	@Column(name = "numeroCuenta", length = 225, nullable = false)
	private String numeroCuenta;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private Cliente cliente;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private TipoCuenta tipoCuenta;
	
	

	public void setMovimiento(Movimiento movimiento) {
		// TODO Auto-generated method stub
		
	}
	



	
		
	}
	


