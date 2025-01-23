#include <iostream>

using namespace std;

int n, m;
int A[100];

int f(int m, int A[]) {
    int sum = A[m-1];

    while (m > 1) {
        if (m % 2 == 0) {
            m = m / 2;
        }
        else {
            m -= 1;
        }
        sum += A[m-1];
    }

    return sum;
}

int main() {
    cin >> n >> m;

    for (int i = 0; i < n; i++) {
        cin >> A[i];
    }

    // Write your code here!
    cout << f(m, A);

    return 0;
}