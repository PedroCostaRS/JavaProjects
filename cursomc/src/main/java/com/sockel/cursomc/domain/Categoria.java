package com.sockel.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	// Atributos da classe devem ser privados para serem acessados através dos
	// getter e setters
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;

	// Getter do ID
	public Integer getId() {
		return id;
	}

	// Setter do ID
	public void setId(Integer id) {
		this.id = id;
	}

	// Getter do Nome
	public String getNome() {
		return nome;
	}

	// Setter do Nome
	public void setNome(String nome) {
		this.nome = nome;
	}

	// Construtor vazio, pode ser instanciado sem atribuir dados aos atributos
	public Categoria() {

	}

	// Gerado automaticamente (Botão direito, source, Generate Constructor Usin
	// Fields)
	public Categoria(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	// Gerado para comparar um atributo por valor e não posição na memória
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	// Gerado para comparar um atributo por valor e não posição na memória
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

	
	
}
