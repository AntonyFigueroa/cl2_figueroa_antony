package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "TipoCuenta")
@Entity(name = "TipoCuenta")
@Getter
@Setter
public class TipoCuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "descripcion", length = 225, nullable = false)
	private String descripcion;

	@Column(name = "moneda", length = 225, nullable = false)
	private String moneda;

	public static void setCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}


}
