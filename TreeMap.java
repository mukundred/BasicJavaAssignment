package Collection;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(103, "Ankit");
        employees.put(101, "Kriti");
        employees.put(104, "Priya");
        employees.put(102, "Rahul");

        System.out.println("TreeMap: " + employees);

        System.out.println("First key: "
                + employees.firstKey());

        System.out.println("Last key: "
                + employees.lastKey());

        employees.remove(103);

        System.out.println("After removing: " + employees);
    }
}
