import java.util.Comparator;
import java.util.List;

public class MyCollections {

    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        return binarySearch(list, key, 0, list.size());
    }

    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return binarySearch(list, key, 0, list.size(), c);
    }

    private static <T> int binarySearch(List<? extends T> list, T key, int fromIndex, int toIndex) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);

            int cmp = ((Comparable<? super T>) midVal).compareTo(key);
            if (cmp < 0) 
                low = mid + 1;
            else if (cmp > 0) 
                high = mid - 1;
            else 
                return mid;
        }
        return -(low + 1);
    }

    public static <T> int binarySearch(List<? extends T> list, T key, int fromIndex, int toIndex, Comparator<? super T> c) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) 
                low = mid + 1;
            else if (cmp > 0) 
                high = mid - 1;
            else 
                return mid;
        }
        return -(low + 1);
    }
}