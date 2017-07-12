package de.springbootbuch.cloudfunctions;

import java.util.function.Function;
import reactor.core.publisher.Flux;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
public class Shout 
	implements Function<Flux<String>, Flux<String>> {

	@Override
	public Flux<String> apply(Flux<String> words) {
		return words
			.map(String::toUpperCase)
			.map(word->word+"!");
	}
}