#include <iostream>

using namespace std;

int N;
int cnt = 0;

int f(int n) {
    if (n == 1) return cnt;
    if (n%2 == 0) 
        n = (int) n/2;
    else 
        n = (int) n/3;
    cnt++;
    return f(n);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << f(N);

    return 0;
}