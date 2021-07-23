package io.educative.springbasics.movierecommendersystem.lesson1;

import io.educative.springbasics.movierecommendersystem.lesson2.Filter;

public class RecommenderImplementation {
    private Filter filter;

    public RecommenderImplementation (Filter filter) {
    	super();
    	this.filter = filter;
	}

	public String[] recommendMovies (String movie) {
        System.out.println("name of the filter: " + filter);
        String[] movieList = filter.getRecommendation("Finding Dory");

	    return movieList;
	}
}
