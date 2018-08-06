package com.example.david.retrofit.models;

class Ids {
    public Integer trakt;
    public String slug;
    public String imdb;
    public Integer tmdb;

    @Override
    public String toString() {
        return "Ids{" +
                "trakt=" + trakt +
                ", slug='" + slug + '\'' +
                ", imdb='" + imdb + '\'' +
                ", tmdb=" + tmdb +
                '}';
    }

    public Integer getTrakt() {
        return trakt;
    }

    public void setTrakt(Integer trakt) {
        this.trakt = trakt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getImdb() {
        return imdb;
    }

    public void setImdb(String imdb) {
        this.imdb = imdb;
    }

    public Integer getTmdb() {
        return tmdb;
    }

    public void setTmdb(Integer tmdb) {
        this.tmdb = tmdb;
    }

}
