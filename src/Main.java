import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> evenSortList = new ArrayList<>();
        for (int x : intList) {
            if (x > 0)
                if (x % 2 == 0)
                    evenSortList.add(x);
        }
        evenSortList.sort(Comparator.naturalOrder());
        for (int i : evenSortList) System.out.print(i + " ");
    }
}
