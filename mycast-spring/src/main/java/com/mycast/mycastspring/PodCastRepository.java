package com.mycast.mycastspring;

import java.util.List;

import com.mycast.mycastspring.model.PodCast;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PodCastRepository extends CrudRepository<PodCast, Integer> {
    
    @Query(value = "SELECT * from podcasts where follow = 1", nativeQuery = true)
    List<PodCast> findAllFollows();
    
    @Query(value = "select * from podcasts where later = 1", nativeQuery = true)
    List<PodCast> findAllLater();

    @Query(value = "select * from podcasts where favorite = 1", nativeQuery = true)
    List<PodCast> findAllFavorite();
    
    @Transactional
    @Modifying
    @Query(value = "UPDATE db_mypodcast.podcasts SET favorite = ?2 WHERE name = ?1", nativeQuery = true)
    void UpdatePodcastFavotite(String name, boolean favorite);

    @Transactional
    @Modifying
    @Query(value = "UPDATE db_mypodcast.podcasts SET later = ?2 WHERE name = ?1", nativeQuery = true)
    void UpdatePodcastLater(String name, boolean later);

    @Transactional
    @Modifying
    @Query(value = "UPDATE db_mypodcast.podcasts SET later = ?2 WHERE name = ?1", nativeQuery = true)
    void UpdatePodcastFollow(String name, boolean follow);
    
    
}