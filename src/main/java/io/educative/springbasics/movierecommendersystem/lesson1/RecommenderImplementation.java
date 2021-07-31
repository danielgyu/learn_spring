package io.educative.springbasics.movierecommendersystem.lesson1;

import io.educative.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class RecommenderImplementation {

    private Filter contentBasedFilter;

    public RecommenderImplementation (Filter filter) {
    	super();
    	this.contentBasedFilter = filter;
	}

	public String[] recommendMovies (String movie) {
        System.out.println("name of the filter: " + contentBasedFilter);
        String[] movieList = contentBasedFilter.getRecommendation("Finding Dory");

	    return movieList;
	}
}
