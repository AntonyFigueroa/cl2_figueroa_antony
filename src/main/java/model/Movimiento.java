package model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Moviemiento")
@Entity(name = "Movimiento")
@Getter
@Setter

public class Movimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 225, nullable = false)
	private String descripcion;
	
	private LocalDate fecha;
	
	@Column(name = "monto", length = 100, nullable = false)
	private double monto;

	@OneToOne(cascade = CascadeType.PERSIST)
	private Cuenta cuenta;

}
