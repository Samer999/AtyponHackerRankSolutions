#include <iostream>
#include <stdio.h>
#include <vector>
#include <string>
#include <set>
#include <queue>
#include <cmath>
#include <map>
#include <algorithm>
#include <stack>
#include <cstring>
#include <unordered_map>

#define ll long long
#define MP make_pair
#define PB push_back
#define P push
#define f first
#define se second
#define S size()
#define B begin()
#define E end()
#define rB rbegin()
#define rE rend()
#define PI acos(-1)


const int N = 1e5 + 100;
const int M = 1e6 + 100;
const ll oo = 2e18;

ll n, m, k, t, q, h, a, b, d, c, e, w, x, y, z;
using namespace std;


int ar[2 * N], ans;

int main() {

     cin >> n;
     for (int i = 0; i < n; i++)
         cin >> ar[i];

     sort(ar, ar + n);

     for (int i = 1; i < n; i++) {
         ans += ar[i] - ar[i - 1] - 1;
     }


     cout << ans << endl;



    return 0;
}