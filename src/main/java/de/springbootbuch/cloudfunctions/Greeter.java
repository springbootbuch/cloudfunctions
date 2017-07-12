package de.springbootbuch.cloudfunctions;

import java.util.function.Function;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
public class Greeter 
	implements Function<String, String> {
	
	@Override
	public String apply(String t) {
		return "Hello, " + t;
	}
}
