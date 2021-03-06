#include <iostream>
#include <algorithm>
using namespace std;

bool c[10];
int a[10];
int num[10];

void go(int index, int start, int n, int m) {
	if (index == m) {
		for (int i = 0; i < m; i++) {
			cout << num[a[i]];
			if (i != m - 1) cout << " ";
		}
		cout << "\n";
		return;
	}

	for (int i = start; i < n; i++) {
		if (c[i]) continue;
		a[index] = i;
		c[i] = true;
		go(index + 1, i + 1, n, m);
		c[i] = false;
	}

}

int main() {
	int n, m;
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		cin >> num[i];
	}
	sort(num, num + n);

	go(0, 0, n, m);

	return 0;
}