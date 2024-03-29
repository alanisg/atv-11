package br.nicolar_ipi.fatec_ipi_paoo_async_named_querrys_atv.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name= "table_cidade")
//@NamedQuery(name="Aluno.buscarPeloNomeEPeloEmail",
			//query="SELECT a FROM  Aluno a WHERE nome= :nome AND email= :email")

@NamedQuery(name="Cidade.buscarPeloNome",
					query="SELECT c FROM Cidade c WHERE c.nome= :nome")
@NamedQuery(name="Cidade.buscarPelaLatitudeLongitude",
					query="SELECT c FROM Cidade c WHERE c.latitude= :lati AND c.longitude= :longi")
@NamedQuery(name="Cidade.buscarPeloNomeIgnoteCase",
					query ="SELECT c FROM Cidade c WHERE LOWER(c.nome)= LOWER(:nomeIgnoreCase)")
public class Cidade {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double latitude, longitude;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidade other = (Cidade) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
