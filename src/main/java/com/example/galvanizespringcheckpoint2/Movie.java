package com.example.galvanizespringcheckpoint2;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Minutes")
    private int minutes;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Rating")
    private float rating;
    @JsonProperty("Metascore")
    private int metascore;
    @JsonProperty("Description")
    private String description;
    @JsonProperty("Votes")
    private int votes;
    private float gross;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Credits")
    private List<Person> credits;

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getMinutes(){
        return this.minutes;
    }
    public void setMinutes(int minutes){
        this.minutes = minutes;
    }
    public String getGenre(){
        return this.genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public float getRating(){
        return this.rating;
    }
    public void setRating(float rating){
        this.rating = rating;
    }
    public int getMetascore(){
        return this.metascore;
    }
    public void setMetascore(int metascore){
        this.metascore = metascore;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getVotes(){
        return this.votes;
    }
    public void setVotes(int votes){
        this.votes = votes;
    }
    @JsonProperty("Gross")
    public float getGross(){
        return this.gross;
    }
    @JsonProperty("gross")
    public void setGross(float gross){
        this.gross = gross;
    }
    public String getYear(){
        return this.year;
    }
    public void setYear(String year){
        if(year.length() == 4){
            this.year = year;
        }
    }
    public List<Person> getCredits(){
        return this.credits;
    }
    public void setCredits(List<Person> credits){
        this.credits = credits;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Person {
        @JsonProperty("Role")
        private String role;
        @JsonProperty("First Name")
        private String firstName;
        @JsonProperty("Last Name")
        private String lastName;

        public String getRole(){
            return this.role;
        }
        public void setRole(String role){
            this.role = role;
        }
        public String getFirstName(){
            return this.firstName;
        }
        public void setFirstName(String firstName){
            this.firstName = firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        public void setLastName(String lastName){
            this.lastName = lastName;
        }
    }
}
