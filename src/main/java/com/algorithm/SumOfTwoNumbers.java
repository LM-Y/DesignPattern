package com.algorithm;


/**
 * @Descripttion 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 *  * 来源：力扣（LeetCode）
 *  * 链接：https://leetcode-cn.com/problems/add-two-numbers
 *  * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author Ming
 * @Date 2020/5/30
 */
public class SumOfTwoNumbers {

    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 8, 11};
        int target = 19;
        int[] result = twoSum(nums, target);
//        System.out.println(result.toString());
        for (int i: result) {
            System.out.println(i);
        }
    }


    /**
     * @Descripttion 两数之和，返回下标
     * @Auth Ming
     * @Date 2020/5/30
     * @param: nums
     * @param: target
     * @return: int[]
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int m = 0; m < nums.length; m++) {
            for (int i = m + 1; i < nums.length; i++) {
                if ((nums[m] + nums[i]) == target) {
                    int[] result = {m, i};
                    return result;
                }
            }
        }
        return null;
    }
}
