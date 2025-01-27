#include <iostream>

using namespace std;

int n;

void PrintStar(int n) {
    if (n == 0) return;
    else 
        for (int i=0; i<n; i++) 
            cout << "*" << " ";
    cout << endl;
    PrintStar(n-1);
    for (int i=0; i<n; i++)
        cout << "*" << " ";
    cout << endl;
}

int main() {
    cin >> n;

    // Write your code here!
    PrintStar(n);

    return 0;
}