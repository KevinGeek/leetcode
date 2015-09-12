package com.kevin.oj.leetcode.medium;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hard = Medium
 * @author kevin
 * @version 15-9-12
 */
public class SearchRange {
    protected static final Logger LOGGER = LoggerFactory.getLogger(SearchRange.class);

    public int[] searchRange(int[] nums, int target) {
        int leftBound = findLeft(nums, 0, nums.length - 1, target);
        int rightBound = findRight(nums, 0, nums.length - 1, target);
        return new int[] { leftBound, rightBound };
    }

    public int findLeft(int[] nums, int start, int end, int target) {
        int index = -1; // default code to the fail case
        while (end >= start) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;
    }

    public int findRight(int[] nums, int start, int end, int target) {
        int index = -1; // default code to the fail case
        while (end >= start) {
            int mid = (end - start) / 2 + start;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (nums[mid] == target) {
                index = mid;
            }
        }
        return index;

    }

        public static void main(String[] args) {
        SearchRange searchRange = new SearchRange();
        LOGGER.info("{}", searchRange.searchRange(new int[] { 2, 2 }, 2));

    }
}
