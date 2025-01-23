import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

class Result {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int lcmA = a.get(0);
		for (int num : a) {
			lcmA = lcm(lcmA, num);
		}

		int gcdB = b.get(0);
		for (int num : b) {
			gcdB = gcd(gcdB, num);
		}

		int count = 0;
		for (int i = lcmA; i <= gcdB; i += lcmA) {
			if (gcdB % i == 0) {
				count++;
			}
		}

		return count;

	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	private static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(firstMultipleInput[0]);

		int m = Integer.parseInt(firstMultipleInput[1]);

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int total = Result.getTotalX(arr, brr);

		bufferedWriter.write(String.valueOf(total));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
