import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Nikita", "Vlasov Petrov", 15));
        persons.add(new Person("Maria", "Lesheva ", 11));
        persons.add(new Person("Andrew", "Durov Perviy Mstitel", 18));
        persons.add(new Person("John", "Bikov Acme Tnt", 12));
        persons.add(new Person("Alex", "Goncharov Pablo", 35));
        persons.add(new Person("Sasha", "Muraeva Tregukrudova Veronika Petrovna", 17));
        persons.add(new Person("Dmitriy", "Pascal Don Kihot ", 20));

        System.out.println(persons);

        persons.sort(new PersonComparator(3));

        persons.removeIf(a -> a.getAge()<18);

        System.out.println(persons);
    }


}