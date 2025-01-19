#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a, b;
    cin >> a;
    cin >> b;

    if (a<0.5 && b<0.5) cout << "Low";
    else if (a<1.0 && b<1.0) cout << "Middle";
    else cout << "High";
    
    return 0;
}