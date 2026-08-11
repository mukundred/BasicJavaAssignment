package Collection;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        marks.add(70);
        marks.add(90);
        marks.add(50);
        marks.add(80);
        marks.add(90);

        System.out.println("TreeSet: " + marks);

        System.out.println("First element: " + marks.first());

        System.out.println("Last element: " + marks.last());

        marks.remove(70);

        System.out.println("After removing 70: " + marks);
    }
}
