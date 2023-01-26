package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyEverydayDemo {
    private static void printContents(List<Person> people){
        for (Person person: people){
            System.out.println(person.getName());
        }
    }
    public static void main(String[] args) {
        Person abel = new Person("Abel", "0943454545", 39);
        Person mark = new Person("Mark", "885-698-9588", 45);
        Person chris = new Person("chris", "801-222-5151" ,38);

        List<Person> people = new ArrayList<Person>();
        people.add(abel);
        people.add(mark);
        people.add(chris);
        System.out.println("Not Sorted");
        printContents(people);
        people.sort(new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getAge() > o2.getAge()) {
                    return 1;

                }
                if (o1.getAge() < o2.getAge()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("\n Sorted by age");
        printContents(people);

        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("\n Sorted by Name");
        printContents(people);

    }
}
