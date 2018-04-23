# Radix Sorting Project

### Description

This project demonstrates the use of queues in the execution of a radix sort on a set of numeric values in an arrayList.

**The Radix Sort Algorithm**

The idea of Radix Sort is to do digit by digit sort starting from least significant digit to most significant digit. Radix sort uses counting sort as a subroutine to sort.

Counting sort is a linear time sorting algorithm that sort in O(n+k) time when elements are in range from 1 to k.

1) Do following for each digit i where i varies from least significant digit to the most significant digit.
………….a) Sort input array using counting sort (or any stable sort) according to the i’th digit.

### To Run

Using terminal on Mac:

```
$ cd Radix-Sorting
$ javac RadixSort.java
$ java RadixSort
```

### Output

<u>RadixSort.java</u>

-Runs QueueReferenceBased first, then the result will print out...

```
1211
3241
4532
4568
6543
6589
6622
7843
7865
8765
9987
```
