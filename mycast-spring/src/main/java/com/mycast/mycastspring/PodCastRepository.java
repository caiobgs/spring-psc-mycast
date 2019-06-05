package com.mycast.mycastspring;

import java.util.List;

import com.mycast.mycastspring.model.PodCast;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PodCastRepository extends CrudRepository<PodCast, Integer> {

    @Query(value = "SELECT * from podcasts where follow = 1", nativeQuery = true)
    List<PodCast> findAllFollows();
    
    @Query(value = "select * from podcasts where later = 1", nativeQuery = true)
    List<PodCast> findAllLater();

    @Query(value = "select * from podcasts where favorite = 1", nativeQuery = true)
	List<PodCast> findAllFavorite();

}