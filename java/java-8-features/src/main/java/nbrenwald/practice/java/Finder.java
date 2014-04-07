package nbrenwald.practice.java;

import java.util.List;
import java.util.function.Predicate;

public class Finder {
	public static Person getFirstMatchingPerson(List<Person> pl,
			Predicate<Person> pred) {
		return pl.stream().filter(pred).findFirst().get();

	}
}
