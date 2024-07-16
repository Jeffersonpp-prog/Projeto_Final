package com.example.Projeto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idpet;
    private String nomepet;
    private String endereco;
    private String raca;
    private String telefone;
    private String donoPet;


	public Paciente(String donoPet) {
		super();
		this.donoPet = donoPet;
	}


	public String getDonoPet() {
		return donoPet;
	}


	public void setDonoPet(String donoPet) {
		this.donoPet = donoPet;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
    public String getRaca() {
		return raca;
	}


	public void setRaca(String raca) {
		this.raca = raca;
	}


	public Paciente () {}


    public Paciente(Integer idpet, String nomepet,String endereco,String raca, String telefone) {
        super();
        this.telefone = telefone;
        this.raca = raca;
        this.idpet = idpet;
        this.nomepet = nomepet;
        this.endereco = endereco;
    }


    public Integer getIdpet() {
        return idpet;
    }


    public void setIdpet(Integer idpet) {
        this.idpet = idpet;
    }


    public String getNome() {
        return nomepet;
    }


    public void setNome(String nomepet) {
        this.nomepet = nomepet;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


	public String getNomepet() {
		return nomepet;
	}


	public void setNomepet(String nomepet) {
		this.nomepet = nomepet;
	}
	

}
