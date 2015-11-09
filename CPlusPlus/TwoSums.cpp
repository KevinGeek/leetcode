/*
 * =====================================================================================
 *
 *       Filename:  TwoSums.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2015年09月22日 11时12分50秒
 *       Revision:  none
 *       Compiler:  g++
 *
 *         Author:  kevin (GK), fangyi.bao@qunar.com
 *   Organization:  
 *
 * =====================================================================================
 */

#include <vector>
#include <iostream>
#include<boost/unordered_map.hpp>  

using namespace std;
class Solution {
    public: vector<int> twoSum(vector<int>& nums, int target) {
                unordered_map<int, int> hash;
                vector<int> res(2, 0);
                for (int i = 0; i < nums.size(); i++) {
                    if (hash.find(target - nums[i]) != hash.end()) {
                        res[0] = hash[target - nums[i]], res[1] = i + 1;
                        return res;
                    }
                    hash[nums[i]] = i + 1;
                }
            }

};

int main(){
    return 0;
}
