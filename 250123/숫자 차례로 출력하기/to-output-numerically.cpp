#include <iostream>

using namespace std;

int N;

void f(int n) {
    if (n == 0) return;
    else f(n-1);
    cout << n << " ";
}

void g(int n) {
    if (n == 0) return;
    else cout << n << " ";
    g(n-1);
}

int main() {
    cin >> N;

    // Write your code here!
    f(N);
    cout << endl;
    g(N);

    return 0;
}