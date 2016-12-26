package sorting;


class BubbleSortDuplexApp {

  public static void main(String[] args) {
    int maxSize = 100;
    ArrayDuxplexBub arr;
    arr = new ArrayDuxplexBub(maxSize);

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

    arr.bubbleSortDuplex();

    arr.display();
  }
}

class ArrayDuxplexBub extends ArrayBub {

  private long[] a;
  private int len;

  ArrayDuxplexBub(int max) {
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

          if (in + 1 == out) {
            for (; in > 0; in--) {
              if (a[in] > a[in - 1]) {
                swap(in, in - 1);
              }
            }
          }
        }
      }
    }
  }

  void bubbleSortDuplex() {
    int out, in;

    long startTime = System.nanoTime();

    for (out = len - 1; out > 1; out--) {
      for (in = 0; in < out; in++) {
        if (a[in] > a[in + 1]) {
          swap(in, in + 1);

          if (in + 1 == out) {
            for (; in > 0; in--) {
              if (a[in] <
                  a[in - 1]) {
                swap(in, in - 1);
              }
            }
          }
        }
      }
    }

    System.out.println(System.nanoTime() - startTime);
  }

  void swap(int one, int two) {
    a[one] = a[one] ^ a[two];
    a[two] = a[one] ^ a[two];
    a[one] = a[one] ^ a[two];
  }
}


