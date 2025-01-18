#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int n;
    cin >> n;

    if (n<500) cout << "no";
    else if (n<1000) cout << "pen";
    else if (n<3000) cout << "mask";
    else cout << "book";
    
    return 0;
}