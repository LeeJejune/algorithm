#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main(){
	int n;
	int score = 0;
	cin >> n;
	vector<int> v(n);
	
	for(int i = 0; i<n; i++){
		cin >> v[i];
	}
	
	sort(v.begin(), v.end());
	
	for( int i = 0; i < n; i++){
		for(int j = 0; j<=i; j++){
			score += v[j];
		}
	}
	cout << score << endl;
}
