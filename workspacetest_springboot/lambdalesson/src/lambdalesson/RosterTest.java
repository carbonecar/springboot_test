package lambdalesson;

import java.util.ArrayList;
import java.util.List;

import lambdalesson.Person.SEX;

public class RosterTest {

	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("carlos",22,SEX.MALE));
		RosterTest.printPersons(persons, new CheckPerson() {

			@Override	
			public boolean test(Person p) {
				return p.getGender() == Person.SEX.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});

		RosterTest.printPersons(persons,
				 c -> c.getGender() == Person.SEX.MALE && c.getAge() >= 18 && c.getAge() <= 25);
		

	}
}
