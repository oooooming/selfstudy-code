#include <iostream>
#include <string>

using namespace std;

string A;

void f(string &s) {
    int cnt = 0;
    for (int i = 0; i < (int)s.length(); i++) {
        if (s[i]!=s[i+1]) cnt += 1;
    }
    if (cnt!=0) cout << "Yes";
    else cout << "No";
}

int main() {
    cin >> A;

    // Write your code here!
    f(A);

    return 0;
}