#include <iostream>

using namespace std;

int a, b;

void cal (int &a, int &b) {
    if (a>b) {
        a *= 2;
        b += 10;
    }
    else {
        a += 10;
        b *= 2;
    }
} 

int main() {
    cin >> a >> b;

    // Write your code here!
    cal(a, b);
    cout << a << " " << b;
    
    return 0;
}