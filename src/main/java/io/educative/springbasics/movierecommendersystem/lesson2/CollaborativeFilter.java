package io.educative.springbasics.movierecommendersystem.lesson2;

public class CollaborativeFilter implements Filter{
    public String[] getRecommendation(String move) {
        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
