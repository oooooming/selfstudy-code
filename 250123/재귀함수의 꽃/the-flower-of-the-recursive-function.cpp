#include <iostream>

using namespace std;

int N;

void PrintNum(int n) {
    if (n == 0) 
        return;
    cout << n << " ";
    PrintNum(n-1);
    cout << n << " ";
}

int main() {
    cin >> N;

    // Write your code here!
    PrintNum(N);

    return 0;
}