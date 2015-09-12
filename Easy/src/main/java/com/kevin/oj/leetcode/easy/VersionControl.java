package com.kevin.oj.leetcode.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author kevin
 * @version 15-9-12
 */
public abstract class VersionControl {
    protected static final Logger LOGGER = LoggerFactory.getLogger(VersionControl.class);

    public int firstBadVersion(int n) {

        return findBadVersion(1, n);
    }

    public int findBadVersion(int start, int end) {

//        LOGGER.debug("start{} end{}",start,end);
        if (start >= end) {
            return start;
        } else {
            int mid = (end - start) / 2 + start;
//            LOGGER.debug("mid{}",mid);
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
            return findBadVersion(start, end);
        }
    }

    public abstract boolean isBadVersion(int version);

    public static void main(String[] args) {
        V v = new V();
        System.out.println(v.firstBadVersion(3));

    }
}

class V extends VersionControl {

    @Override
    public boolean isBadVersion(int version) {
        return version > 1;
    }
}