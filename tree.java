/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//
		
		
	}
}


// representation of tree:
1. structure way:
// structure of a node
		class Node {
			int val;
			Node left;
			Node right;
			Node(int v, Node left, Node right) {
				this.val = v;
				this.left = left;
				this.right = right;
			}
		};
		Node left = new Node(2, null, null);
		Node right = new Node(5, null, null);
		Node head = new Node(10, left, right);
		
2. Array represnentation
for index, i,
left = 2i+1
right = 2i+2
parent = i/2

[2,5,N,6,N,N], N means null
1,2, 3 none , 4 both
[3,1,6,4,3,6] ? 
[4,N,6] ?

[1,N,N] ? 
[1,2,3,4,5,N,N] ?
for complete tree, all N should be in last

[1,3,4,5,2]



HEAP
if a heap of n nodes, height logn
PROPERTIES:
1. AWAYS COMPLETE TREE
2. 2 types of heaps:
	1. Max heap: Parent is always bigger than child
	2. Min heap: Parent is always smaller than child
	
	
	
sorting algorightms:
1. insertion sort n^2
2. bubble sort n^2
3. selection sort n^2
4. merge sort nlogn
5. quick sort n^2 
6. Heap sort nlogn

HEAP:
1. build heap  --> 
2. Heapify -->


class MinHeap {
	int a[];
	int n; // size of array/heap.

	
	void heapify(int ind) { // complexity? logn
		// compare it with both childrens
		int left = 2*ind + 1; // 1
		int right = 2*ind + 2; // 2
		int min = ind; // 0
		if (left < n && a[left] < a[min]) {
			// left is smaller than root
			min = left; // min = 1
		}
		if (right < n && a[right] < a[min]) {
			// right is smaller than root and left
			min = right; // min = 2
		}
		if (min != ind) { // correct
			// we need to swap
			int temp = a[ind];
			a[ind] = a[min];
			a[min] = temp;
			// recursively call
			heapify(min);
		}
	}

  void build() {  // complexity? looks like O(nlogn) but it is actually O(n)
    for(int i = n/2; i >= 0; i--) {// second last level right most node
      heapify(i);
    }
  }
}

logn


[5,4,3]
index: 0,1,2

min = 0,


[3,4,5]






1 2 4 8 16 32
for perfect tree:
max num of nodes at n level = 2*(nodes at n-1 level)
sum of nodes from 0..n-1 level = node at level n - 1


generalizing complexity of build of heap:
level n-1: total nodes = 2^(n-1) depth = 1 = 1* 2^(n-1)
n-2: total 2^(n-2), depth = 2 = 2 * 2^(n-2)
......


1 * 2^(n-1) + 2 * 2^(n-2) + 3 * 2^(n-3) +  .. n * 2^(0)

= O(n)





// heap sort
