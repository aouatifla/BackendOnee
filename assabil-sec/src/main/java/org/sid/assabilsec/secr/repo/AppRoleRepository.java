package org.sid.assabilsec.secr.repo;

import org.sid.assabilsec.secr.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
	AppRole findByRoleName(String roleName);
}
