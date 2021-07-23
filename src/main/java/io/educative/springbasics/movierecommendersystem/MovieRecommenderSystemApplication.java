package io.educative.springbasics.movierecommendersystem;

import io.educative.springbasics.movierecommendersystem.lesson1.ContentBasedFilter;
import io.educative.springbasics.movierecommendersystem.lesson1.RecommenderImplementation;
import io.educative.springbasics.movierecommendersystem.lesson2.CollaborativeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation implementation = new RecommenderImplementation(new CollaborativeFilter());
		String[] recommendedMovies = implementation.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(recommendedMovies));
	}
}
