package io.educative.springbasics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

public class ContentBasedFilter implements Filter{

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}