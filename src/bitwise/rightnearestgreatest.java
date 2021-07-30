package bitwise;

import java.util.*;

public class rightnearestgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 3, 2, 5, 0, 1}; // 5 5 5 1 1 -1
		int len = arr.length;
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> res = new Stack<Integer>();
		res.push(-1);
		s.push(arr[len - 1]);
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] > s.peek()) {
				res.push(s.peek());
				s.push(arr[i]);
			} else {
				res.push(s.peek());
			}
		}
		System.out.println(res);

	}

}
