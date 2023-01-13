package com.example.demosecurity.dao;

import com.example.demosecurity.ds.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository<Role,Integer> {

    Optional<Role> findRoleByRoleName(String roleName);
}
