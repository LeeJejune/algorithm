#include <iostream>
#include <algorithm>
#include <string>
#include <fstream>
#include <array>

using namespace std;

int main() {
	int n;
	cin >> n;
	for (int i = 0; i <= n; i++) {
		if (i % 3 == 0) {
			continue;
		}
		cout << i << ' ';
	}
	return 0;
}
