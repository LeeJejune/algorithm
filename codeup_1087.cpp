#include <iostream>
#include <algorithm>
#include <string>
#include <fstream>
#include <array>

using namespace std;

int main() {
	int n, sum = 0;
	cin >> n;
	for (int i = 0; ; i++) {
		sum += i;
		if (sum >= n) {
			cout << sum;
			break;

		}
	}
	return 0;
}
