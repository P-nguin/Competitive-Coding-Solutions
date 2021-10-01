#include <bits/stdc++.h>

using namespace std;

const int N = 2 * 1e3;
int d, k, a[N], b;

int main() {
    cin >> k >> d;
    for(int i = 0; i < d; i++) {
        cin >> a[i];
    }
    sort(a, a+d);

    if(d == 1 && a[0] == 0) {
        cout << -1 << endl;
    }
    else if(k == 1) {
        if(a[0] == 0) b = a[1];
        else b = a[0];
        cout << b << endl;
    }
    else if(k%2 == 0) {
        if(a[0] == 0) b = a[1];
        else b = a[0];

        cout << b;
        for(int i = 0; i < k-2; i++) {
            cout << a[0];
        }
        cout << b << endl;
    }
    else {
        if(a[0] == 0) b = a[1];
        else b = a[0];

        k-=3;

        cout << b;
        for(int i = 0; i < k/2; i++) {
            cout << a[0];
        }
        if(b < a[0]) cout <<b;
        else cout << a[0];

        for(int i = 0; i < k/2; i++) {
            cout << a[0];
        }
        cout << b << endl;
    }
}
