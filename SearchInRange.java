public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(Linearsearch(arr, target, 1,4));

    }

    static int Linearsearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        // runa for loop
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
