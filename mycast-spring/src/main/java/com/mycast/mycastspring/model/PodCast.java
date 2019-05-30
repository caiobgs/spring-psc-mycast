package com.mycast.mycastspring.model;

/**
 * PodCast
 */
public class PodCast {

    private boolean favorite;
    private boolean history;
    private boolean later;
    private boolean follow;

    public boolean isFavorite() {
        return favorite;
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

    public boolean isHistory() {
        return history;
    }

    public void setHistory(boolean history) {
        this.history = history;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }


}