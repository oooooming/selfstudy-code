#include <iostream>

using namespace std;

int n;
int arr[50];

void abs_arr(int *x, int n) {
    for (int i = 0; i < n; i++) {
        x[i] = abs(x[i]);
        cout << x[i] << " ";
    }
}

int main() {
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    // Write your code here!
    abs_arr(arr, n);

    return 0;
}