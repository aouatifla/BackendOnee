package org.sid.assabil.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity 
@Data @AllArgsConstructor @NoArgsConstructor @ToString

public class ordre_releve {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Id;
    private String SEQUENCE;
    private String POSTALCODE;
    private String ENVISAGEINDEX;
}
