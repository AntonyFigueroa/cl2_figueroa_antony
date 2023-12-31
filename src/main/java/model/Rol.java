package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Rol")
@Entity(name = "Rol")
@Getter
@Setter
public class Rol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "activo"  , nullable = false)
	private boolean activo;
	
	@Column(name = "descripcion", length = 225, nullable = false)
	private String descripcion;



}
