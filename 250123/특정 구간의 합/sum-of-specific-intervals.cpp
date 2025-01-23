#include <iostream>

using namespace std;

int n, m;
int arr[100];

int f(int a1, int a2) {
    int sum = 0;
    for (a1; a1<=a2; a1++) {
        sum += arr[a1-1];
    }
    return sum;
}

int main() {
    cin >> n >> m;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < m; i++) {
        int a1, a2;
        cin >> a1 >> a2;
        cout << f(a1, a2) << endl;
    }

    // Write your code here!

    return 0;
}