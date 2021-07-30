import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class HelloWorld {

	interface square {
		public int calculate(int x);
	}

	interface namesWithAlpha {
		public boolean isStart(String c, String t);
	}

	interface doubledo {
		public int doIT(int x);
	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		square s = (x) -> x * x;
		System.out.println(s.calculate(12));
		List<String> names = Arrays.asList("sai", "badam", "teja", "sushma");
		Collections.sort(names);
		System.out.println(names);
		// names.sort(new Comparator() {
		//
		//
		//
		// @Override
		// public int compare(Object arg0, Object arg1) {
		// // TODO Auto-generated method stub
		// return 0;
		// }
		//
		// });
		namesWithAlpha n = (c, t) -> t.startsWith(c);

		for (String st : names) {

			if (n.isStart("t", st)) {
				System.out.println(st);
			}
		}
		// int arr = new int[5]{1,2,3,4,5};
		int[] arr;
		arr = new int[2];
		arr[0] = 10;
		arr[1] = 20;
		// arr[2]=30;

		doubledo d = (int x) -> 2 * x;

		for (int i = 0; i < 2; i++) {
			System.out.println(d.doIT(arr[i]));
		}

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
		numbers.forEach(s1 -> System.out.print(s1 * s1 + " "));

		List<Integer> ex1 = numbers.stream().map(s2 -> 2 * s2).collect(Collectors.toList());
		System.out.println(ex1);

		List<String> ex2 = names.stream().filter(s3 -> s3.startsWith("s")).collect(Collectors.toList());
		System.out.print(ex2);

		int product = IntStream.range(2, 8)
				.reduce((num1, num2) -> num1 * num2)
				.orElse(-1);

		// Displaying the product
		System.out.println("The product is : " + product);

		int sum = numbers.stream().reduce(0, (a1, a2) -> a1 + a2);

		int p = numbers.stream().reduce(1, (a1, a2) -> a1 * a2);
		System.out.println(sum);
		System.out.println(p);
		int arr1[] = {1, 2, 3, 4};
		Stream<int[]> st = Stream.of(arr1);
		IntStream intStreamNew = st.flatMapToInt(Arrays::stream);
		intStreamNew.forEach(x -> System.out.println(x));
		IntStream.range(1, 11).forEach(i -> System.out.println(2 * i));

		IntStream.range(0, 10).forEach(x -> System.out.print((0 + (int) Math.pow(2, x)) + " "));
		String h1 = "hello";
		String h2 = "java";
		System.out.println(h1.substring(0, 1).toUpperCase() + h1.substring(1));

	}
}