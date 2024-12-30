import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        byte[] byteArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Тестирование binarySearch для byte:");
        testBinarySearch(byteArray, (byte) 5);
        testBinarySearch(byteArray, (byte) 10);

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        System.out.println("\nТестирование binarySearch для char:");
        testBinarySearch(charArray, 'd');
        testBinarySearch(charArray, 'z');

        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("\nТестирование binarySearch для int:");
        testBinarySearch(intArray, 5);
        testBinarySearch(intArray, 10);

        long[] longArray = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L};

        System.out.println("\nТестирование binarySearch для long:");
        testBinarySearch(longArray, 5L);
        testBinarySearch(longArray, 10L);

        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};

        System.out.println("\nТестирование binarySearch для float:");
        testBinarySearch(floatArray, 4.4f); 
        testBinarySearch(floatArray, 6.6f); 

        double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("\nТестирование binarySearch для double:");
        testBinarySearch(doubleArray, 3.3); 
        testBinarySearch(doubleArray, 6.6); 

        short[] shortArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("\nТестирование binarySearch для short:");
        testBinarySearch(shortArray, (short) 5);
        testBinarySearch(shortArray, (short) 10);

        
        Person[] personArray = {
            new Person("Ivan", 30),
            new Person("Bob", 25),
            new Person("Jhon", 35),
            new Person("Alexey", 28)
        };
        
        java.util.Arrays.sort(personArray, Comparator.comparing(Person::getName));
        
        System.out.println("\nТестирование binarySearch для объектов Person:");
        testBinarySearch(personArray, new Person("Jhon", 35), Comparator.comparing(Person::getName));
        testBinarySearch(personArray, new Person("Дима", 40), Comparator.comparing(Person::getName));

        List<Integer> intList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("\nТестирование binarySearch для Integer:");
        testBinarySearch(intList, 5, Integer::compareTo);
        testBinarySearch(intList, 10, Integer::compareTo);

        List<Character> charList = new ArrayList<>(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'));
        System.out.println("\nТестирование binarySearch для Character:");
        testBinarySearch(charList, 'd', Character::compareTo);
        testBinarySearch(charList, 'z', Character::compareTo);
    }

    private static void testBinarySearch(byte[] array, byte key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(char[] array, char key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(int[] array, int key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(long[] array, long key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(float[] array, float key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(double[] array, double key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static void testBinarySearch(short[] array, short key) {
        int result = MyArrays.binarySearch(array, key);
        displayResult(result, key);
    }

    private static <T> void testBinarySearch(T[] array, T key, Comparator<? super T> comparator) {
        int result = MyArrays.binarySearch(array, key, comparator);
        displayResult(result, key);
    }

    private static <T> void testBinarySearch(List<? extends T> list, T key, Comparator<? super T> comparator) {
        int result = MyCollections.binarySearch(list, key, comparator);
        displayResult(result, key);
    }
    
    private static <T> void displayResult(int result, T key) {
        if (result >= 0) {
            System.out.println("Ключ " + key + " найден на индексе " + result);
        } else {
            System.out.println("Ключ " + key + " не найден." + -(result + 1));
        }
    }
}
