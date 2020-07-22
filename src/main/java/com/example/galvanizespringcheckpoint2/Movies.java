package com.example.galvanizespringcheckpoint2;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/movies")
public class Movies {
    @GetMapping("/movie")
    public Movie getSingleMovie(){
        Movie godfather = new Movie();
        godfather.setTitle("The Godfather");
        godfather.setMinutes(175);
        godfather.setGenre("Crime, Drama");
        godfather.setRating((float)9.2);
        godfather.setMetascore(100);
        godfather.setDescription("The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.");
        godfather.setVotes(1561591);
        godfather.setGross((float)134.97);
        godfather.setYear("1972");

        Movie.Person person = new Movie.Person();
        person.setFirstName("Francis Ford");
        person.setLastName("Copolla");
        person.setRole("Director");

        Movie.Person person2 = new Movie.Person();
        person2.setFirstName("Marlon");
        person2.setLastName("Brando");
        person2.setRole("Star");

        godfather.setCredits(Arrays.asList(person,person2));
        return godfather;
    }

    @PostMapping("/gross/total")
    public Result postGross(@RequestBody List<Movie> movieList){
        float gross = 0;
        for(int i=0; i<movieList.size();i++){
            Movie movie = movieList.get(i);
            gross += movie.getGross();
        }
        Result result = new Result();
        result.result = gross;

        return result;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private static class Result{
        private float result;

        public void setResult(float result){
            this.result = result;
        }
        public float getResult(){
            return this.result;
        }
    }
}

