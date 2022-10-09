package com.period4.week14;

/**
 * @version 1.0
 * @authoe 李祥基
 * * leetcode 75
 */
public class solution {
    public void sortColors(int[] nums) {
        int[] cnt = new int[3];
        for (int num : nums)
            cnt[num]++;
        for (int i = 0; i < cnt[0]; i++) {
            nums[i] = 0;
        }
        for (int i = cnt[0]; i < cnt[0] + cnt[1]; i++) {
            nums[i] = 1;
        }
        for (int i = cnt[0] + cnt[1]; i < cnt[0] + cnt[1] + cnt[2]; i++) {
            nums[i] = 2;
        }
    }
}
