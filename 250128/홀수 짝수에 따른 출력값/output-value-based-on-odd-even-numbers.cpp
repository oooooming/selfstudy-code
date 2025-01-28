#include <iostream>

using namespace std;

int N;

int f(int n) {
    if (n <= 2) 
        return n;
    return f(n-2) + n;
}

int main() {
    cin >> N;

    // Write your code here!
    cout << f(N);

    return 0;
}