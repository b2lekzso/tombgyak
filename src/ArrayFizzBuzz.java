void main() {
    int[] arr = new int[100];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = i + 1;
    }
    for (int i : arr) {
        if (i % 3 == 0 && i % 5 == 0) {
            IO.println("FizzBuzz");
        } else if (i % 3 == 0) {
            IO.println("Fizz");
        } else if (i % 5 == 0) {
            IO.println("Buzz");
        } else {
            IO.println(i);
        }
    }
    for (int i = 0; i < arr.length; i++) {
        if (i % 15 == 0) {
            IO.println(i);
        } else {
            IO.print(i + ", ");
        }
    }
}