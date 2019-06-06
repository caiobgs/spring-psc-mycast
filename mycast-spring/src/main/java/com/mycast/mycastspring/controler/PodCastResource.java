package com.mycast.mycastspring.controler;

import com.mycast.mycastspring.PodCastRepository;
import com.mycast.mycastspring.model.PodCast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController    
@RequestMapping(path="/podcast" ) 
public class PodCastResource {
	@Autowired 
	private PodCastRepository podcastRepository;

	@GetMapping(path="/add") 
	public @ResponseBody String addNewPodcast (@RequestParam String name
			, @RequestParam boolean favorite, @RequestParam boolean later , @RequestParam boolean follow) {
		

		PodCast n = new PodCast();
		n.setName(name);
		n.setFavorite(favorite);
		n.setFollow(follow);
		n.setLater(later);
		podcastRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<PodCast> getAllUsers() {
		
		return podcastRepository.findAll();
		
	}
	@GetMapping(path="/follow")
	public @ResponseBody Iterable<PodCast> getAllFollow() {
		
		return podcastRepository.findAllFollows();
		
	}
	@GetMapping(path="/later")
	public @ResponseBody Iterable<PodCast> getAllLater() {
		
		return podcastRepository.findAllFollows();
		
	}

	@GetMapping(path="/favorite")
	public @ResponseBody Iterable<PodCast> getAllFavorite() {
		
		return podcastRepository.findAllFavorite();
		
	}

	@PostMapping(path="/favorite/update")
	public @ResponseBody void updateFavorite(@RequestBody PodCast podcast) {

		
		
		podcastRepository.UpdatePodcastFavotite(podcast.getName(), podcast.isFavorite());
		
	}	
	

	@PostMapping(path="/later/update")
	public @ResponseBody void updateLater(@RequestParam String name
	, @RequestParam boolean later) {
		
		 podcastRepository.UpdatePodcastLater(name, later);
		
	}

	@PostMapping(path="/follow/update")
	public @ResponseBody void updateFollow(@RequestParam String name
	, @RequestParam boolean follow) {
		
		 podcastRepository.UpdatePodcastFollow(name, follow);
		
	}
}
