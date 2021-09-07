package org.sid.assabil.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Contrat {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private Date dateCreation;
	@ManyToOne
	private Client client;
	
	@OneToOne(mappedBy = "contrat")
	private Compteur compteur;
	
	

}
