package org.sid.assabil.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Consomation {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private Long indexx;
	private String adrresse;
	
	@ManyToOne
	private Compteur compteur;
	
	
	
	

}
