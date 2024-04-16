package ExampleTest;

public class RemoveElements {

	public int[] removeElement(int[] nums, int val) {
		if (nums.length < 0) {
			System.err.println("Null list;");
		}

		int k = 0, len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return nums;
	}
}
