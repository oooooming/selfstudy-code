#include <iostream>
#include <string>

using namespace std;

string A;

void f(string &s) {
    bool flag = false;
    for (int i = 0; i < (int)s.size(); i++) {
        if (s[0]!=s[i]) flag = true;
    }
    if (flag) cout << "Yes";
    else cout << "No";
}

int main() {
    cin >> A;

    // Write your code here!
    f(A);

    return 0;
}