package io.educative.springbasics.movierecommendersystem;

import io.educative.springbasics.movierecommendersystem.lesson11.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
		// RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);

		String[] result = recommender.recommendMovies("Finding Dory");
		// String[] result2 = recommender2.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(result));
		// System.out.println(Arrays.toString(result2));
	}
}
