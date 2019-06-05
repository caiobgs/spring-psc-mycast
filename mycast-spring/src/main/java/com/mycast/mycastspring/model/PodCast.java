package com.mycast.mycastspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "podcasts")
public class PodCast {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
	private boolean favorite;
	private boolean later;
	private boolean follow;

	public String getName() {
		return name;
	}

	public boolean isFollow() {
		return follow;
	}

	public void setFollow(boolean follow) {
		this.follow = follow;
	}

	public boolean isLater() {
		return later;
	}

	public void setLater(boolean later) {
		this.later = later;
	}

	public boolean isFavorite() {
		return favorite;
	}

	public void setFavorite(boolean favorite) {
		this.favorite = favorite;
	}

	public void setName(String name) {
		this.name = name;
	}

	


}