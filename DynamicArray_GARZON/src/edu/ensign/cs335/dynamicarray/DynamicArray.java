package edu.ensign.cs335.dynamicarray;

/**
 * Interface declaring the methods to be implemented in the concrete instance of DynamicArray.
 * NOTE: There should be no gaps in this array.
 * @param <T> The generic type to stored in a DynamicArray.
 */
public interface DynamicArray<T> {

    /**
     * Adds an element to the dynamic array at the next open space in the array.  If the array is full,
     *  resize the array with a capacity of double of the previous capacity.
     * @param element The element to add.
     */
    void add(final T element);

    /**
     * Removes an element from the array at the provided index and returns it.
     * @param index The position in the array.  Be sure to watch and throw appropriate exception if it is outside the capacity.
     * @return The value of the element T at the given index OR null if nothing there.
     */
    T remove(final int index);

    /**
     * Replace or add an element T at the specified index.  If there is already an element at the given index, overwrite the value.
     *  If the element is outside the size of the array, be sure to throw an appropriate exception.  This method does NOT
     *  resize the array.
     * @param index The position at which to place the element.
     * @param element The element T to place at the given index.
     */
    void put(final int index, T element);

    /**
     * Returns the element at the given index.  If the index it outside the array size, be sure to throw an appropriate exception.
     * @param index The index of the element to return.
     * @return The element T
     */
    T get(final int index);

    /**
     * Returns the total number of elements T currently contained in the dynamic array.
     * @return The count of elements in the dynamic array that are NOT null.
     */
    int getSize();

    /**
     * Returns the maximum number of potential elements T that can be held in the array.
     * @return The max count of positions (null or non-null) currently in the array.
     */
    int getCapacity();

    /**
     * Returns true if the size is 0.  ELse false.
     * @return True if the size is 0, else false.
     */
    boolean isEmpty();
}