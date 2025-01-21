#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    cin >> b >> a;

    for (b; b>=a; b-=2) {
        cout << b << " ";
    }
    return 0;
}