package main;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i<100; i++) {
			arr.add(i);
		}
		
		Node root = Node.arrayToTree(arr);
		
		Node current = root;
		while(current.left != null) {
			System.out.println(current.left.value);
			current = current.left;
		}
		while(current.right != null) {
			System.out.println(current.right.value);
			current = current.right;
		}
		System.out.println(root.left.value);
		System.out.println(root.right.value);

	}
}
