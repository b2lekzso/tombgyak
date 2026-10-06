void main() {
    int[] arr = { 12, 45, 67, 89, 100, 23, 3456, 897, 452, 444, 899, 700 };
    int osszeg = 0;
    for (int i : arr) {
        osszeg += i;
    }
    IO.println(osszeg / arr.length);
}