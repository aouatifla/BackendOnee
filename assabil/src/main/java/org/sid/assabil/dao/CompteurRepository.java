package org.sid.assabil.dao;

import org.sid.assabil.entities.Compteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteurRepository extends JpaRepository<Compteur,Long> {

}
