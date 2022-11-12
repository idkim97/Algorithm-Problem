package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준10953 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str,",");
			int cnt = st.countTokens();
			int res = 0;
			for(int j=0;j<cnt;j++) {
				res += Integer.parseInt(st.nextToken());
			}
			System.out.println(res);
		}
		
	}
}
