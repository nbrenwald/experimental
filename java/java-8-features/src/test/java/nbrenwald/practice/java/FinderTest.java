package nbrenwald.practice.java;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FinderTest {
	private List<Person> pl;
	

	@Before
	public void setup() {
		pl = new ArrayList<>();
		pl.add(new Person("John", "Aa", 32));
		pl.add(new Person("Joe", "Bb", 33));
		pl.add(new Person("Jesse", "Cc", 31));
		pl.add(new Person("Jesse", "Cc", 38));
	}

	@Test
	public void one() {
		assertTrue(true);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void two() {
		Finder.getFirstMatchingPersonFunctional(pl, p -> p.getAge() <20);
	}

}
