#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
using namespace std;
int main() {
	int n;
	cin >> n;
   
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < i; j++) {
			cout << " ";
		}
		for (int j = 0; j < 2 * (n - i) - 1; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	for (int i = 0; i < n - 1; i++) {
		for (int j = 0; j < n - i - 2; j++) {
			cout << " ";
		}
		for (int j = 0; j < 2 * (i + 2) - 1; j++) {
			cout << "*";
		}
		cout << "\n";
	}
	return 0;
}
