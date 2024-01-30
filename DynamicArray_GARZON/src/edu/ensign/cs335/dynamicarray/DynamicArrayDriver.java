package edu.ensign.cs335.dynamicarray;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DynamicArrayDriver {

    public static void main(String... args) {
        new DynamicArrayDriver();
    }

    private DynamicArrayDriver() {

        DynamicArray<Integer> integerArray = this.generatePopulatedDynamicArray(100);

        System.out.println("DynamicArray capacity: " + integerArray.getCapacity());
        System.out.println("DynamicArray size: " + integerArray.getSize());
        System.out.println("DyanmicArray is empty: " + integerArray.isEmpty());

        System.out.println("\nAdding element to array: ");
        integerArray.add(900);
        System.out.println("DynamicArray capacity: " + integerArray.getCapacity());
        System.out.println("DynamicArray size: " + integerArray.getSize());

        System.out.println("\nRemoving element at index 11");
        integerArray.remove(10);
        System.out.println("DynamicArray capacity: " + integerArray.getCapacity());
        System.out.println("DynamicArray size: " + integerArray.getSize());

        List<Integer> removedElements = new ArrayList<>();
        System.out.println("Removing values from the DynamicArray: ");
        for (int index = 99; index >= 50; index--) {
            removedElements.add(integerArray.remove(index));
        }

        System.out.print("Removed elements: ");
        for (Integer val : removedElements) {
            System.out.print(val + ", ");
        }

        System.out.println("\n\nPutting element at position 14:");
        integerArray.put(14, 44);
        System.out.println("Value at position 14: " + integerArray.get(14));

        System.out.println("Removing all elements from the DynamicArray:");
        while (!integerArray.isEmpty()) {
            integerArray.remove(0);
        }
        System.out.println("DynamicArray capacity: " + integerArray.getCapacity());
        System.out.println("DynamicArray size: " + integerArray.getSize());
        System.out.println("DyanmicArray is empty: " + integerArray.isEmpty());
    }

    private DynamicArray<Integer> generatePopulatedDynamicArray(int count) {

        DynamicArray<Integer> integerDynamicArray = new DynamicArrayImpl<>(count);

        Random random = new Random();

        for (int i = 0; i < count; i++) {
            integerDynamicArray.add(random.nextInt(200) + 1);
        }

        return integerDynamicArray;
    }
}