/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MaxHeap {
	int a[];
	int n;
	public void heapify(int ind, int size) { // complexity? logn
		// compare it with both childrens
		int left = 2*ind + 1; // 1
		int right = 2*ind + 2; // 2
		int max = ind; // 0
		if (left < size && a[left] > a[max]) {
			// left is smaller than root
			max = left; // min = 1
		}
		if (right < size && a[right] > a[max]) {
			// right is smaller than root and left
			max = right; // min = 2
		}
		if (max != ind) { // correct
			// we need to swap
			int temp = a[ind];
			a[ind] = a[max];
			a[max] = temp;
			// recursively call
			heapify(max);
		}
	}

  public void build() {  // complexity? looks like O(nlogn) but it is actually O(n)
    for(int i = n/2; i >= 0; i--) {
      heapify(i);
    }
  }
  
  
  public void add(int val) {
  	// increase size of heap
  	n = n+1;
  	a[n-1] = val; // put the value at last position in the array
  	addUtil()
  }
  
  private void addUtil(int ind) {
  	if (par == 0) {
  		return;
  	}
  	int parent = ind/2;
  	// compare with parent
  	if (a[pare] < a[ind]) {
  		// swap and recursively call
  		int temp = a[par];
  		a[par] = a[ind];
  		a[ind] = temp;
  		addUtil(par);
  	}
  }
  
  void heapSort() { // complexity? 
  	build(); // build max heap O(n)
  	for(int i = n-1; i >= 1; i--) { // O(nlogn)
  		// here i means new heap size
  		// swap first and last element
  		int temp = a[0];
  		a[0] = a[i];
  		a[i] = temp;
  		
  		heapify(0, i);
  	}
  	// print the array, it will be sorted now
  }
}

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	}
}

3,4,5,1,0,7, n = 6
k = 3: output: 7,4,5


given array of size n, find maximum k elements of the array?

1. sort array: O(nlogn)
2. brute force: O(n*k)
3. build max heap: O(n) + pop k elements from max heap: klogn == n + klogn (just like heap sort)
4. you are hired--> nlogk

