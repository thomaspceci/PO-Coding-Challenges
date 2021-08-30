package main;

import java.util.List;

public class Node {
	
	Object value;
	Node left;
	Node right;
	
	Node(Object value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public static <T> Node arrayToTree(List<T> arr) {
		int middle = arr.size()/2;
		if (middle==0) {
			return new Node(arr.get(middle), null, null);
		} else {
			return new Node(arr.get(middle), arrayToTreeSub(arr, 0, middle-1), arrayToTreeSub(arr, middle+1, arr.size()-1));
		}	
	}
	
	public static <T> Node arrayToTreeSub(List<T> arr, int start, int finish) {
		int middle = start + (finish - start)/2;
		if(start==finish) {
			return new Node(arr.get(start), null, null);
		} else if(start>finish) {
			return null;
		} else {
			return new Node(arr.get(middle), arrayToTreeSub(arr, start, middle-1), arrayToTreeSub(arr, middle+1, finish));
		}
	}
	
}
