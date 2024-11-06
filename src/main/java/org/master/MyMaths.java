// SPDX-FileCopyrightText: 2024 Justin Getzke
//
// SPDX-License-Identifier: MIT

package org.master;

public class MyMaths {
	
	public int gcd(int m, int n) {
		
		int r;
		if (n>m) {
			
			r = m;
			m = n;
			n = r;
		}
		
		r = m % n;
		while (r != 0) {
			
			m = n;
			n = r;
			r = m % n;
		}		
		return n;
	}
	
}
