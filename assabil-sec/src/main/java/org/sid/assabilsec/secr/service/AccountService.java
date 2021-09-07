package org.sid.assabilsec.secr.service;

import java.util.List;

import org.sid.assabilsec.secr.entities.AppRole;
import org.sid.assabilsec.secr.entities.AppUser;

public interface AccountService {
    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username, String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
