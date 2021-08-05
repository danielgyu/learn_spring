package io.educative.springbasics.movierecommendersystem.lesson11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class RecommenderImplementation {

    private Filter filter;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public void setFilter(Filter filter) {
        logger.info("dependency injection to RecommenderImplementation filter");
        this.filter = filter;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("in recommender implementation postconstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("in recommender implementation predestroy");
    }

    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}