package io.educative.springbasics.movierecommendersystem.lesson5;

import org.springframework.stereotype.Component;

public class CollaborativeFilter implements Filter{

    public String[] getRecommendations(String movie) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}