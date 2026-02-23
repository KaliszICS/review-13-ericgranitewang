import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void swap(ArrayList<String> arr, int a, int b) {
		String temp = arr.get(a);
		arr.set(a, arr.get(b));
		arr.set(b, temp);
	}

	public static ArrayList<Double> createArrayList(double[] a) {
		ArrayList<Double> sus = new ArrayList<Double>();
		for (int i = 0; i < a.length; i++) {
			sus.add(a[i]);
		}
		return sus;
	}

	public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < names.length; i++) {
			map.put(names[i], ages[i]);
		}
		return map;
	}

	public static void increaseAge (HashMap<String, Integer> map, String name) {
		map.put(name, map.get(name)+1);
	}
}
