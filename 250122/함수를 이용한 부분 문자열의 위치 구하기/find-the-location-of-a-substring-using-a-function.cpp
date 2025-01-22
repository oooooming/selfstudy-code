#include <iostream>
#include <string>

using namespace std;

string text;
string pattern;

int find_pattern() {
    for (int i = 0; i <= text.size() - pattern.size(); i++) {
        bool found = true;
        if (text[i] == pattern[0]) {
            for (int j = 1; j < pattern.size(); j++) {
                if (text[i+j]!=pattern[j]) {
                    found = false;
                    break;
                }
            }
            if (found) return i;
        }
    } 
    return -1;
}

int main() {
    cin >> text;
    cin >> pattern;

    // Write your code here!
    cout << find_pattern();

    return 0;
}