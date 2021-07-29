package io.educative.springbasics.movierecommendersystem.lesson1;
import io.educative.springbasics.movierecommendersystem.lesson2.Filter;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
	public String[] getRecommendation(String movie) {
		return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
	}
}