package org.sid.assabil.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Compteur {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String type;
	private String Adresse;
	private Date dateInstallation;
	private Date dateFin;
	
	@ManyToOne
	private Releveur releveur;
	
	@ManyToOne
	private Client client;
	
	@OneToMany(mappedBy="compteur")
	private Collection<Consomation> consomations;
	
	 @OneToOne(cascade = CascadeType.ALL)
	 @JoinColumn(name = "contrat_id", referencedColumnName = "id")
	 private Contrat contrat;
	

}
