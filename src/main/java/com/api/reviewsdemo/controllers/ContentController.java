package com.api.reviewsdemo.controllers;

import com.api.reviewsdemo.entities.Content;
import com.api.reviewsdemo.model.request.InfoNewContentRequest;
import com.api.reviewsdemo.model.response.GenericResponse;
import com.api.reviewsdemo.services.ContentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContentController {

    @Autowired
    ContentService service;

    @PostMapping("/content")
    public ResponseEntity<GenericResponse> create (@RequestBody InfoNewContentRequest newContent){

        GenericResponse response = new GenericResponse();

        Content content = service.create(newContent.review, newContent.title, newContent.type);

        response.isOk = true;
        response.message = "A new review has been created";
        response.id = content.getContentId();

        return ResponseEntity.ok(response);


    }

    @GetMapping("/content")
    public ResponseEntity<Content> getRandom() {

        return ResponseEntity.ok(service.bringRandom());


      

    }

    
}