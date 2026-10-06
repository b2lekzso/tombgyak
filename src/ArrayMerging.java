void main() {
    int[] arr1 = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
    int[] arr2 = { 10, 324, 45, 90, 9808 };
    int[] arr = new int[arr1.length + arr2.length];
    for (int i = 0; i < arr1.length; i++) {
        arr[i] = arr1[i];
    }
    for (int i = 0; i < arr2.length; i++) {
        arr[arr1.length + i] = arr2[i];
    }
    for (int i : arr) {
        IO.println(i);
    }
}