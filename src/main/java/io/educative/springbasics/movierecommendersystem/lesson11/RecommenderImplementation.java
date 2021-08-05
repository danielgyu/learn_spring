import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

package io.educative.springbasics.movierecommendersystem.lesson11;
import io.educative.springbasics.movierecommendersystem.lesson6.Filter;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    // @Autowired
    // @Qualifier("CBF")
    private Filter filter;

    public String [] recommendMovies (String movie) {

        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}