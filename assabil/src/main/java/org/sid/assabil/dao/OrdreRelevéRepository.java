package org.sid.assabil.dao;

import org.sid.assabil.entities.ordre_releve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrdreRelevéRepository extends JpaRepository<ordre_releve,Long> {

}
