#include <bits/stdc++.h>
#include <cmath>

using namespace std;

int n;
vector<double> vec;

int main() {
    cin >> n;
    for(int i = 0; i < n; i++) {
        double a;
        cin >> a;
        vec.push_back(a);
    }

    while(true) {
        int in;
        cin >> in;

        if(in == 77) {
            break;
        }
        else if(in == 99) {
            int num;
            double p;
            cin >> num >> p;

            double r = vec[num-1] * ((100-p)/100.0);
            vec.insert(vec.begin() + num, r);
            vec[num-1] -= r;
        }
        else if(in == 88) {
            int num;
            cin >> num;

            vec[num-1] += vec[num];
            vec.erase(vec.begin() + num);
        }
    }

    for(double d : vec) cout << round(d) << " ";
    cout << endl;
}
