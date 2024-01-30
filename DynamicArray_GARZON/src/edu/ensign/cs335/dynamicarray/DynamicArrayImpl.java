package edu.ensign.cs335.dynamicarray;

import java.util.Arrays;

//implementing the DynamicArray interface
public class DynamicArrayImpl<T> implements DynamicArray<T> {

    // set initial capacity dynamic array
    private static final int DEFAULT_CAPACITY = 10;
    
    // Array to store 
    private T[] array;
    
    // number of elements 
    private int size;

    // Default constructor calling the parameterized constructor with the default capacity
    public DynamicArrayImpl() {
        this(DEFAULT_CAPACITY);
    }

    // Parameterized constructor initializing the array with a specified capacity
    public DynamicArrayImpl(int capacity) {
        // Check if the specified capacity is valid
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        // Initialize the array with the specified capacity
        this.array = (T[]) new Object[capacity];
        // Initialize the size to zero
        this.size = 0;
    }

    // Method to ensure that the array has enough capacity
    private void ensureCapacity() {
        // If the array is full, double its capacity
        if (size == array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
    }

    // Method to add an element to the array
    @Override
    public void add(T element) {
        // Ensure there is enough capacity to add an element
        ensureCapacity();
        // Add the element to the next available position in the array
        array[size++] = element;
    }

    // Method to remove an element at the specified index
    @Override
    public T remove(int index) {
        // Validate the index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        // Store the element to be removed
        T removedElement = array[index];
        // Shift elements to fill the gap
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        // Set the last element to null to indicate removal
        array[--size] = null;
        // Return the removed element
        return removedElement;
    }

    // Method to replace or add an element at the specified index
    @Override
    public void put(int index, T element) {
        // Validate the index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        // Set the element at the specified index
        array[index] = element;
    }

    // Method to get the element at the index
    @Override
    public T get(int index) {
        // Validate the index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        // Return the element to the index
        return array[index];
    }

    // get the current elements in the array
    @Override
    public int getSize() {
        return size;
    }

    //  get the max capacity of the array
    @Override
    public int getCapacity() {
        return array.length;
    }

    // check if the array is empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}