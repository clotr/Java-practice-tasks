import java.util.ArrayList;

public class Unique {
    public static void main(String[] args) {
        int[] array = {1, 23, 56, 23, 56, 56, 56, 23, 1, 67, 89, 1, 1, 1, 82};
        System.out.println(unique(array));
    }

    public static ArrayList unique(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean itemOK = true;
        for (int i = 0; i < array.length - 1; i++) {
            itemOK = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] - array[j] == 0) {
                    itemOK = false;
                }
            }
            if (itemOK) list.add(array[i]);
            if (i - (array.length - 2) == 0) list.add(array[i + 1]);
        }
        return list;
    }
}


