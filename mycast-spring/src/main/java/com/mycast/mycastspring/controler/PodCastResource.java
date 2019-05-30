package com.mycast.mycastspring.controler;

import java.awt.List;
import java.util.HashMap;

import com.mycast.mycastspring.model.PodCast;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * PodCastResource
 */
@RestController
public class PodCastResource {

    private HashMap<Integer, PodCast> podcasts;

    public PodCastResource(){

        this.podcasts = new HashMap<Integer, PodCast>();
        
    }
    @RequestMapping(value="/inicio" , method=RequestMethod.GET)
    public ResponseEntity<List<PodCast>> GetPodcastItunes(){

    }
}