package Sorting;

import java.io.*;
import java.util.*;


public class 백준10814_나이순정렬 {
	
	public static class Pair implements Comparable<Pair>{
		int age;
		String name;
		
		Pair(int age, String name){
			this.age = age;
			this.name = name;
		}
		
		@Override
		public int compareTo(Pair p1) {
			return this.age - p1.age;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Pair> list = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String na = st.nextToken();
			
			list.add(new Pair(a,na));
			
		}
		
		Collections.sort(list);
		
	}
}
