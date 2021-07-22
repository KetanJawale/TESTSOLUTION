package com.sol;

public class Solutions {

	static int getCrossingPeople(int[] A) {

		int count = 0;
		for (int i = 0; i <= A.length - 1; i++) {
			if (A[i] == 0) {
				for (int j = i; j < A.length - 1; j++) {
					if (A[i] != A[j + 1]) {
						count += 1;
					}
				}
			}
		}
		return count >= 1000000000 ? -1 : count;
	}

	public static void main(String[] args) {
		int[] A = { 0, 1, 0, 1, 1};
		System.out.println(getCrossingPeople(A));
	}
}
