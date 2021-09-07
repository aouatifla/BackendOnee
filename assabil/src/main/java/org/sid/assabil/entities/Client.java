package org.sid.assabil.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Client {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String addresse;
	private String typeTarif;
	
	@OneToMany(mappedBy="client")
	private Collection<Compteur> compteurs;
	
	@OneToMany(mappedBy="client")
	private Collection<Contrat> contrats;
	
}
