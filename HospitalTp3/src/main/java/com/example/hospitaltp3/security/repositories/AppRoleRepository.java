package com.example.hospitaltp3.security.repositories;


import com.example.hospitaltp3.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}