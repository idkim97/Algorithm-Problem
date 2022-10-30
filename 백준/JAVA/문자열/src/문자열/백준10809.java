package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		int[] alpha = new int[26];
		for(int i=0;i<26;i++) {
			alpha[i]=-1;
		}
		
		for(int i=0;i<str.length();i++) {
			int temp = str.charAt(i)-'a';
			if(alpha[temp]==-1) alpha[temp] = i;
		}
		
		for(int i=0;i<alpha.length;i++) {
			System.out.print(alpha[i]+" ");
		}
	}

}
