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

    @RequestMapping(value="/inicio" ,produces = MediaType.APPLICATION_JSON_VALUE , method=RequestMethod.GET)
    public ResponseEntity<List<PodCast>> GetPodcastItunes(){
        final String uri = "https://itunes.apple.com/lookup?id=909253&entity=album";
        
        RestTemplate restTemplate = new RestTemplate();
        EmployeeListVO result = restTemplate.getForObject(uri, EmployeeListVO.class);
        System.out.println(result)
    }
}