package com.api.reviewsdemo.repos;

import com.api.reviewsdemo.entities.Content;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentRepository extends JpaRepository<Content, Integer>{

    Content findByContentId(Integer contentId);
    
}