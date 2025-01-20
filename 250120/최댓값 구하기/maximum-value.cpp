#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b, c, max;
    cin >> a >> b >> c;

    max = a;
    if (a < b) max = b;
    if (max < c) max = c;
    cout << max;

    return 0;
}