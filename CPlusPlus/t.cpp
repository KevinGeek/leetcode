/*
 * =====================================================================================
 *
 *       Filename:  t.cpp
 *
 *    Description:  
 *
 *        Version:  1.0
 *        Created:  2015年09月22日 20时15分38秒
 *       Revision:  none
 *       Compiler:  g++
 *
 *         Author:  kevin (GK), fangyi.bao@qunar.com
 *   Organization:  
 *
 * =====================================================================================
 */
#include <iostream>
#include <vector>
using namespace std;


vector<int> test(){
    vector<int> res(2,0);
    return res;
}

int main(){
    test();
    cout << "hello world" << endl;
    return 0;
}
