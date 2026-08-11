package com.java.collections;

import java.util.*;

public class collections_demo {

    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Apple");

        System.out.println("ArrayList: " + list);
        System.out.println("Search Mango: " + list.contains("Mango"));

        list.set(0, "Orange");
        list.remove("Banana");

        System.out.println("Updated ArrayList: " + list);

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList: " + linkedList);

        linkedList.addFirst(5);
        linkedList.addLast(40);

        System.out.println("Updated LinkedList: " + linkedList);

        // HashSet
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");

        System.out.println("HashSet: " + set);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet: " + treeSet);

        // PriorityQueue
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after remove: " + queue);

        // HashMap
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("HashMap: " + map);
        System.out.println("Value of key 2: " + map.get(2));

        // Collections methods
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(40);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Before Sorting: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted: " + numbers);

        Collections.reverse(numbers);
        System.out.println("Reversed: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled: " + numbers);

        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
    }
}
