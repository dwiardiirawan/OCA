package com.java.mock.exam.declaration;

//static import java.util.Arrays.sort;
//import java.util.Arrays.*;
//import java.util.Arrays.sort;
//import static java.util.*;

import static java.util.Arrays.sort;
// OR import static java.util.Arrays.*;

public class Sorter {
	public static void main(String... args) {
		int[] a = {3, 1, 22, 5, 11, 2};
		sort(a);
		System.out.println("test");
	}
}
