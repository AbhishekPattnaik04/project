package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CampusMind;
@Repository
public interface CampusMindRepository extends JpaRepository<CampusMind, Integer> {

}
