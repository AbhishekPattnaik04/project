package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.GoodDeed;
@Repository
public interface GoodDeedRepository extends JpaRepository<GoodDeed, Integer>{

}
