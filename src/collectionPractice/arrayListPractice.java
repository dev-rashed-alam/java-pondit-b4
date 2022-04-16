package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListPractice {
    /**
     * ArrayList implements list interface, and it maintains insertion sort order, and it is non synchronized.
     * The default size of an ArrayList is 10.
     * ArrayList internally uses a dynamic array to store the elements.
     * Manipulation with ArrayList is slow
     * ArrayList is better for storing and accessing data.
     * Arraylist contains duplicate elements.
     * ArrayList increase size implementation is newCapacity = oldCapacity + (oldCapacity >> 1)
     * From jdk 1.5 ArrayList support generic feature
     * we can't create ArrayList by primitive type we need to use wrapper class type
     **/

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(15);
        arrayList.add(20);
        arrayList.add(3);

        //array list maintain insertion order
        printData(arrayList);

        System.out.println("==== Sort array list by asc ====");
        Collections.sort(arrayList);
        printData(arrayList);

        System.out.println("==== Sort array list by desc ====");
        Collections.sort(arrayList, Collections.reverseOrder());
        printData(arrayList);

        System.out.println("==== Remove zero index ====");
        arrayList.remove(0);
        printData(arrayList);

        System.out.println("==== add new item in first index ====");
        arrayList.add(1, 100);
        printData(arrayList);

        System.out.println("==== update element by index ====");
        arrayList.set(1, 500);
        printData(arrayList);

        System.out.println("==== clear arrayList ====");
        arrayList.clear();
        printData(arrayList);
    }

    static void printData(ArrayList<?> arrayList){
        for (Object item : arrayList) {
            System.out.println(item);
        }
    }
}
