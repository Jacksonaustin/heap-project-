package com.jacksonaustin.heap;


// Defines the basic operations supported by a heap.
public interface Heap<T extends Comparable<T>> {


    // Returns the number of items in the heap.
    public int size(); 

    // Removes and returns the top item.
    public T pop();

    // Returns the top item without removing it.
    public T peek();

    // Adds an item to the heap.
    public void push(T item); 

    // Returns whether the heap contains no items.
    public boolean isEmpty(); 

    //clear heap of all items. 
    public void clear();
    

}
