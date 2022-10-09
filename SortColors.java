package com.period4.week14;

/**
 * @version 1.0
 * @authoe 李祥基
 */
public class SortColors {
    //更一般的计数排序算法
    public void sortColors(int[] nums) {
        int R = 3;
        //处理的元素范围是[0 , R)的计数排序
        int[] cnt = new int[R];
        for (int num : nums)
            cnt[num]++;
        //[index[i] , index[i+1] )的值为i
        int[] index = new int[R + 1];
        for (int i = 0; i < R; i++) {
            //左边界从0开始，因此只需从头开始计算右边界即可
            index[i + 1] = index[i] + cnt[i];
        }
        //给nums数组重新进行赋值
        for (int i = 0; i + 1 < index.length; i++) {
            for (int j = index[i]; j < index[i + 1]; j++) {
                nums[j] = i;
            }
        }
    }
}
