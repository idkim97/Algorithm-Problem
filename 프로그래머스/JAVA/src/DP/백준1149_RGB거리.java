package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����1149_RGB�Ÿ� {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] home = new int[1001][4];
		int[][] d = new int[1001][4];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<3;j++) {
				home[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=1;i<=n;i++) {
			d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + home[i][0];
			d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + home[i][1];
			d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + home[i][2];
		}
		
		int res = Math.min(Math.min(d[n][0], d[n][1]), d[n][2]);
		System.out.println(res);
	}
}
