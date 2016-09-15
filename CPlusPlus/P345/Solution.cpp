/*
 * =====================================================================================
 *
 *       Filename:  Solution.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2016年05月17日 13时40分56秒
 *       Revision:  none
 *       Compiler:  gcc
 *
 *         Author:  YOUR NAME (), 
 *   Organization:  
 *
 * =====================================================================================
 */
#include <malloc.h>
#include <stdlib.h>
#include <stdio.h>
#include <iostream>
#include <string.h>

using namespace std;

class Solution {

	public:

		string reverseVowels(string s) {
			int index = s.find_first_of("aeiou");
			cout << index << endl;
		}

};

int main(){

	Solution* s = new Solution();
	s->reverseVowels("haha");
	cout << "hello" << endl;	
}
