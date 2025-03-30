public class BinarySearch_example {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 50, 60, 70, 80, 100, 110, 120};

        System.out.println(BinarySearch(arr, 30, 0, arr.length-1));
    }

    public static int BinarySearch(int[] arr, int key, int left, int right ){
        int midVal = (left + right) / 2;

        if (left > right) {
            return -1;
        }

        // 배열의 중간값을 찾으려는 값과 비교 후 같다면 중간 값 인덱스 return
        if (arr[midVal] == key) {
            return midVal;
        } else if (key < arr[midVal]) { // 배역의 중간값이 찾으려는 값보다 크다면 중간값 보다 작은 부분 배열로 재탐색
            return BinarySearch(arr, key, left, midVal - 1);
        } else { // 배열의 중간값이 찾으려는 값보다 작다면 중간값 보다 큰 부분 배열로 재탐색
            return BinarySearch(arr, key, midVal + 1, right);
        }
    }
}