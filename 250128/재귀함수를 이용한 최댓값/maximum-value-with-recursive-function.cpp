#include <iostream>

using namespace std;

int n;
int arr[100];

int PrintMax(int max, int i) {
    i++;
    if (i > n) return max;
    if (arr[n-i] > max) 
        return PrintMax(arr[n-i], i);
    else 
        return PrintMax(max, i);
    
}

int main() {
    cin >> n;

    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    int max = arr[n-1];
    // Write your code here!
    cout << PrintMax(max, 2);

    return 0;
}