import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nikita", "Vlasov Petrov", 23));
        persons.add(new Person("Maria", "Lesheva ", 25));
        persons.add(new Person("Andrew", "Durov Perviy Mstitel", 18));
        persons.add(new Person("John", "Bikov Acme Tnt", 33));
        persons.add(new Person("Alex", "Goncharov Pablo", 35));
        persons.add(new Person("Sasha", "Muraeva Tregukrudova Veronika Petrovna", 45));
        persons.add(new Person("Dmitriy", "Pascal Don Kihot ", 20));

        Comparator<Person> comparator = (o1, o2) -> {
            String[] words1 = o1.getSurname().split(" ");
            String[] words2 = o2.getSurname().split(" ");
            if (words1.length >= 3 && words2.length >= 3) {
                return Integer.compare(o1.getAge(), o2.getAge());
            } else if (words1.length != words2.length) {
                return Integer.compare(words1.length, words2.length);
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        System.out.println(persons);

        Collections.sort(persons,comparator);
        System.out.println("---------       ---------       ---------       ---------");

        System.out.println(persons);

    }
}

