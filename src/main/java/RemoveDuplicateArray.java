public class RemoveDuplicateArray {
    public static void main(String[] args) {
    int[] nums = {1,1,2,3,3,5,7,7};
    //if array is not sorted used Arrays.arrayname to sort array
    int nums1 = removeDuplicate(nums);
        System.out.println("Array Length: " + nums1);

    }

    private static int removeDuplicate(int[] nums) {
        if(nums.length == 0)
            return 0;

        int i = 0;
        for (int j = 1; j< nums.length; j++)
        {
            if (nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }


}
