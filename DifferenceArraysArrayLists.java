import java.util.ArrayList;

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {
        // 1. Declaration and Initialization
        // Array: An array in is a fixed-size collection of elements of the same data type.
        // Arrays do have limitations. Therefore, the array's size must be specified upon its creation.
        int[] intArray = new int[5]; // Array of size 5

        // ArrayList: An ArrayList is art of Java's Collection Network, and provides a more dynamic and flexible way to handle collections of objects.
        // Unlike arrays, ArrayLists can dynamically grow or shrink in size. Therefore, there is no need to specify its size.
        ArrayList<Integer> intList = new ArrayList<>();

        // 2. Adding Elements
        // Array: Use the index to assign values. (Arrays lack built-in method for common operations like resizing, searching, or adding elements.
        // This requires us to handle the task of adding elements manually.)
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;

        // ArrayList: Use add() method to add elements. (ArrayLists, on the other hand, offer numerous built-in methods to resize, search for, or add elements.)
        intList.add(10);
        intList.add(20);
        intList.add(30);

        // 3. Accessing Elements
        // Array: Access the elements via index directly.
        System.out.println("Array Element at index 1: " + intArray[1]);

        // ArrayList: By using one of its numerous available methods, use the 'get()' method to access the elements.
        System.out.println("ArrayList Element at index 1: " + intList.get(1));

        // 4. Size
        // Array: As mentioned, the size of an array is fixed, and can only be obtained by using '.length'.
        System.out.println("Array Size: " + intArray.length);

        // ArrayList: The size of an ArrayList is dynamic, and can be obtained using 'size()'.
        System.out.println("ArrayList Size: " + intList.size());

        // 5. Adding Beyond Initial Capacity
        // Array: An array cannot add beyond its declared size. Please see example line below for error reference:
        // intArray[5] = 40; // IndexOutOfBoundsException

        // ArrayList: An ArrayList will automatically grow its size as necessary, and will not cause any errors. 
        intList.add(40); // No error
        System.out.println("ArrayList after adding more elements: " + intList);

        // 6. Removal of Elements
        // Array: Due to an array's limitations, there is no direct way to remove elements. This would require a manual shift of elements.
        // Example: Removing element at index 1 from the array.
        for (int i = 1; i < intArray.length - 1; i++) {
            intArray[i] = intArray[i + 1];
        }
        intArray[intArray.length - 1] = 0; // An ArrayList's ability to remove elements is optional: See example below to clear the last element of the ArrayList.
        System.out.println("Array after removing element at index 1:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ArrayList: With the use of the remove() method, you can also remove elements.
        intList.remove(1); // Removes element at index 1
        System.out.println("ArrayList after removing element at index 1: " + intList);

        // 7. Type Flexibility
        // Array: An array must specify its data type at declaration, and it cannot change.
        String[] stringArray = { "A", "B", "C" };

        // ArrayList: An ArrayList can work with objects and multiple types of data. Furthermore, an ArrayList also uses generics to specify type.
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

        // Printing both the array and the ArrayList for comparison.
        System.out.println("Array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();

        System.out.println("ArrayList: " + stringList);
    }
}