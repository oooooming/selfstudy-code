#include <iostream>

using namespace std;

int N;

int f(int n) {
    if (n == 1) 
        return 1;
    if (n == 2) 
        return 1;
    return f(n-1) + f(n-2);
}

int main() {
    cin >> N;

    // Write your code here!
    cout << f(N);

    return 0;
}