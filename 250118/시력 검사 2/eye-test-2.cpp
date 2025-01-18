#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    double a;
    cin >> a;

    if (a<0.5) cout << "Low";
    else if (a<1.0) cout << "Middle";
    else cout << "High";
    
    return 0;
}