import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    protected int maxSurname;

    public PersonComparator(int maxSurname) {
        this.maxSurname = maxSurname;
    }

    @Override
    public int compare(Person o1, Person o2) {
        String[] words1 = o1.getSurname().split(" ");
        String[] words2 = o2.getSurname().split(" ");
        if (words1.length >= maxSurname && words2.length >= maxSurname) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else if (words1.length != words2.length) {
            return Integer.compare(words1.length, words2.length);
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}