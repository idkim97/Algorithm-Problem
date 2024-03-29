package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준2193_이친수 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[][] d = new long[91][2];

		int n = Integer.parseInt(br.readLine());

		d[1][0] = 0;
		d[1][1] = 1;

		for (int i = 2; i <= n; i++) {

			d[i][0] = (d[i - 1][0] + d[i - 1][1]);

			d[i][1] = d[i - 1][0];

		}

		long res = d[n][1] + d[n][0];

		System.out.println(res);

	}
}
