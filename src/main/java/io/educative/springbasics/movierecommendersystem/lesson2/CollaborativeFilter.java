package io.educative.springbasics.movierecommendersystem.lesson2;

import org.springframework.stereotype.Component;

@Component
public class CollaborativeFilter implements Filter{
    public String[] getRecommendation(String move) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
