package com.api.reviewsdemo.services;

import java.util.List;

import com.api.reviewsdemo.entities.Content;
import com.api.reviewsdemo.repos.ContentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContentService {
    
    @Autowired
    ContentRepository repo;

    public Content findContent(Integer contentId){
        
        Content content = repo.findByContentId(contentId);

        return content;
    }

    public Content create(String review, String title, String type) {

        Content content = new Content ();
        content.setTitle(title);
        content.setType(type);
        content.setReview(review);
    
        return repo.save(content);
    }

    public Content bringRandom() {

        List<Content> allContent = repo.findAll();

        int min = 1;
        int max = allContent.size();
        int random = (int) (Math.random() * ((max - min) + 1)) + min;
      
        return allContent.get(random - 1);
    }

}
