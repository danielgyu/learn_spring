package io.educative.springbasics.movierecommendersystem.lesson11;

import io.educative.springbasics.movierecommendersystem.lesson11.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Primary
public class ContentBasedFilter implements Filter {

    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PostConstruct
    private void postConstruct() {
        System.out.println("in content based filter postconstruct");
    }

}
