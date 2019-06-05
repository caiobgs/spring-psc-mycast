package com.mycast.mycastspring.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PodCastRepository extends CrudRepository<PodCast, Integer> {

    @Query(value = "select * from podcasts where follow = 1", nativeQuery = true)
	List<PodCast> findAllFollows();

}