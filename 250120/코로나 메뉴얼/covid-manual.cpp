#include <iostream>
using namespace std;

int main() {
    // Please write your code here.
    int f1, f2, f3;
    char s1, s2, s3;

    cin >> s1 >> f1;
    cin >> s2 >> f2;
    cin >> s3 >> f3;

    if ((s1=='Y')&&(f1>=37)) {
        if (((s2=='Y')&&(f2>=37))||((s3=='Y')&&(f3>=37))) cout << 'E';
        else cout << 'N';
    }
    else {
        if (((s2=='Y')&&(f2>=37))&&((s3=='Y')&&(f3>=37))) cout << 'E';
        else cout << 'N';
    }


    return 0;
}