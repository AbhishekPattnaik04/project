package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.controller.CafeManagerController;
import com.example.entity.CafeManager;
@Repository
public interface CafeManagerRepository extends JpaRepository<CafeManager, Integer> {

}
