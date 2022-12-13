import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 삼성SDS_거의제곱고리 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//int t = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		int result=0;
		
		StringTokenizer st = new StringTokenizer(input," ");
		int count = st.countTokens();
		int[] test = new int[count];
		for(int i=0;i<count;i++) {
			test[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순 정렬
		Arrays.sort(test);
		
		// next_permutation 구현
		
		// 처음부터 마지막까지 연속된 수 합 계산
		for(int i=0;i<count-1;i++) {
			int temp = test[i]+test[i+1];
			Double sqrt = Math.sqrt(temp);
			if(sqrt==sqrt.intValue()) result++;
		}
		
		// 마지막숫자와 첫번째 숫자 까지 계산해줘야됨
		int temp = test[0]+test[count-1];
		Double sqrt = Math.sqrt(temp);
		if(sqrt==sqrt.intValue()) result++;

		System.out.println(result);
		
		
	}
	
	public void nextPermutation(int n, int[] test) {
		int idx = n-1;
		while(idx>0 && test[idx-1] > test[idx]) {
			idx--;
		}
	}
	
	
}
