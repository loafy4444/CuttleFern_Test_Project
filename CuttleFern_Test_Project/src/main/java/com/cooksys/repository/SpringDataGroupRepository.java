package com.cooksys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.entity.Group;

public interface SpringDataGroupRepository extends JpaRepository<Group, Long> {

}
