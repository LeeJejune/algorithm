#include <iostream>
#include <algorithm>
#include <string>
#include <fstream>
#include <array>

using namespace std;

int main() {
    int n, m, o;
    int count = 0;
    cin >> n >> m >> o;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < o; k++) {
                printf("%d %d %d\n", i, j, k);
                count += 1;
            }
        }
    }
    cout << count;
}
