package de.springbootbuch.cloudfunctions;

import java.util.function.Function;

/**
 * Part of springbootbuch.de.
 *
 * @author Michael J. Simons
 * @author @rotnroll666
 */
public class Chain {
	public static void main(String...a) {
		final Function<String, String> hello = 
			s -> "Hello, " + s;
		final Function<String, String> goodbye = 
			s -> s + " and goodbye...";
		
		String greeting = hello.andThen(goodbye)
				.apply("Michael");
		System.out.println(greeting);
	}
}
