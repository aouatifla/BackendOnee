package org.sid.assabil.dao;

import org.sid.assabil.entities.Contrat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ContratRepository extends JpaRepository<Contrat,Long> {

}
