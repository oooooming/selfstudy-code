#include <iostream>
#include <string>

using namespace std;

string A;

bool palindrome(string &s) {
    for (int i=0; i< s.length(); i++) {
        if (s[i] != s[s.length() - i - 1]) return false;
        return true;   
    }
}

int main() {
    cin >> A;

    // Write your code here!
    if (palindrome(A)) cout << "Yes";
    else cout << "No";

    return 0;
}