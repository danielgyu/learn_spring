package io.educative.springbasics.movierecommendersystem.lesson7;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component
// @Qualifier("contentBasedFilter")
public class ContentBasedFilter implements Filter{

    public String[] getRecommendations(String movie) {

        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
