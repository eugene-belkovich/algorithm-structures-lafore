package sorting;


class BubbleSortApp {

  public static void main(String[] args) {
    int maxSize = 100;
    ArrayBub arr;
    arr = new ArrayBub(maxSize);

    arr.insert(77);
    arr.insert(99);
    arr.insert(44);
    arr.insert(55);
    arr.insert(22);
    arr.insert(88);
    arr.insert(11);
    arr.insert(00);
    arr.insert(66);
    arr.insert(33);

    arr.display();

    arr.bubbleSort();

    arr.display();
  }
}

class ArrayBub {

  private long[] a;
  private int len;

  ArrayBub() {
  }

  ArrayBub(int max) {
    a = new long[max];
    len = 0;
  }

  void insert(long value) {
    a[len] = value;
    len++;
  }

  void display() {
    for (int j = 0; j < len; j++) {
      System.out.print(a[j] + " ");
    }
    System.out.println("");
  }

  void bubbleSort() {
    int out, in;

    for (out = len - 1; out > 1; out--) {
      for (in = 0; in < out; in++) {
        if (a[in] > a[in + 1]) {
          swap(in, in + 1);
        }
      }
    }
  }

  void swap(int one, int two) {
    a[one] = a[one] ^ a[two];
    a[two] = a[one] ^ a[two];
    a[one] = a[one] ^ a[two];
  }
}



