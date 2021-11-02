package ProjetJava;

public class Task3 {
    public static void main(String[] args) {
        int[] nums = new int[] {10, 20, 30, 40, 50};
        int f = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = f;
        System.out.println(nums[nums.length - 5] + nums[nums.length - 3]);
    }
}
