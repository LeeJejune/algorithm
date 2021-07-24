#include <iostream>
#include <algorithm>
#include <string>
#include <fstream>
#include <array>

using namespace std;

int main() {
	long long a, b, c;
	int day = 1;
	cin >> a >> b >> c;
	while (day % a != 0 || day % b != 0 || day % c != 0) {
		day += 1;
	}
	cout << day;
}
