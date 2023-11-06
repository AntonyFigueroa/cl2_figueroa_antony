package model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "Cliente")
@Entity(name = "Cliente")
@Getter
@Setter

public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "apellidoPaterno", length = 225, nullable = false)
	private String apellidoPaterno;

	@Column(name = "apellidoMaterno", length = 225, nullable = false)
	private String apellidoMaterno;

	@Column(name = "nombres", length = 225, nullable = false)
	private String nombres;

	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Rol> rol;
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombres=" + nombres + "]";
	}

	public void setCuenta(Cuenta cuenta) {
		// TODO Auto-generated method stub
		
	}

	public void setRol(List<Rol> roles) {
		// TODO Auto-generated method stub
		
	}
	
	

}
