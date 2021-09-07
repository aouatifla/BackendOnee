package org.sid.assabilsec.secr.repo;

import org.sid.assabilsec.secr.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,Long> {
	   AppUser findByUsername(String username);

}
