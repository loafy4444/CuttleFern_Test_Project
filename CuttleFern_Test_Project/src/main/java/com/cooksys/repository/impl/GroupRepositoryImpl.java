package com.cooksys.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cooksys.entity.Group;
import com.cooksys.model.GetAllGroupsResponse;
import com.cooksys.repository.GroupRepository;

@Repository
public class GroupRepositoryImpl implements GroupRepository{

	@Autowired
    EntityManager em;

    @Override
    public Group get(long id) {
        return em.createQuery("select group from Group group where group.id = :id", Group.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<GetAllGroupsResponse> getAll() {
        return em.createQuery("select new com.cooksys.model.GetAllGroupsResponse(group.id, group.name) from Group group", GetAllGroupsResponse.class).getResultList();
    }
}
