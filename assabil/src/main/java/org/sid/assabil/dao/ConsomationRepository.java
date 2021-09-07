package org.sid.assabil.dao;

import org.sid.assabil.entities.Consomation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ConsomationRepository extends JpaRepository <Consomation,Long> {

}
