// SPDX-FileCopyrightText: 2024 Justin Getzke
//
// SPDX-License-Identifier: MIT

package org.master;

public class Stack {  
	
	private int maxSize = 0;
	int pos = -1;
	int[] stackArr = null;
	
	public Stack(int size) {
		maxSize = size;
		stackArr = new int[size];
	}	  

	public boolean isEmpty() {  
		if (this.size() == 0)  
			return true;  
		return false;  
	}  

	public int pop() {  
		if (pos == -1)  
			return -1;
		int element = stackArr[pos];  
		stackArr[pos] = -1;  
		pos--;  
		return element;  
	}  

	public void push(int element) throws StackOverflowError,IllegalArgumentException {  		
		if (element<0)
			throw new IllegalArgumentException();
		int npos = pos + 1;  
		if (npos == maxSize)  
			throw new StackOverflowError("Stack is full");  
		pos = npos;  
		stackArr[pos] = element;  
	}  

	public int size() { 		
		return pos + 1;  
	}  	

	public int top() {
		if (pos == -1)
			return -1;
		return stackArr[pos];
	}
}  
