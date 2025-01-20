#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int a_eng, a_math, b_eng, b_math;
    cin >> a_math >> a_eng;
    cin >> b_math >> b_eng;

    if (a_math > b_math) cout << "A";
    else if (a_math < b_math) cout << "B";
    else {
        if (a_eng > b_eng) cout << "A";
        else cout << "B";
    }

    return 0;
}