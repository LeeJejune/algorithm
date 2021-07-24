#include <iostream>
#include <algorithm>
#include <string>
#include <fstream>
#include <array>

using namespace std;

int main() {
	long long a, m, d, n;
	cin >> a >> m >> d >> n;
	for (int i = 1; i < n; i++) {
		a = a * m + d;
	}
	cout << a;
}
