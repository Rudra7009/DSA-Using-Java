public class demo {

    public static void main(String[] args) {
        int nums[]={5,6,7,9,11,13};
        int target=25;
        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target,0,nums.length-1);

        if(result1!=-1)
            System.out.println("Element Found at index [Linear Search]: "+ result1);
        else
            System.out.println("Element not found");

        if(result2!=-1)
            System.out.println("Element Found at index [Binary Search]: "+ result2);
        else
            System.out.println("Element not found");

    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for(int i=0; i<nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps by Linear : " + steps);
                return i;
            }
        }
        System.out.println("Steps by Linear : "+steps);
        return -1;
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        int steps=0;
        while(left<=right){
            steps++;
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                binarySearch(nums,target,mid+1,right);
            }
            else
                binarySearch(nums,target,left,mid-1 );
        }
        return -1;
    }
}
