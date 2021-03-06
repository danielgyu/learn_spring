package io.educative.springbasics.movierecommendersystem.lesson5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class RecommenderImplementation {

    private Filter contentBasedFilter;

    public String [] recommendMovies (String movie) {

        System.out.println("\nName of the filter in use: " + contentBasedFilter + "\n");

        String[] results = contentBasedFilter.getRecommendations("Finding Dory");

        return results;
    }

}