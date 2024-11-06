// SPDX-FileCopyrightText: 2024 Justin Getzke
//
// SPDX-License-Identifier: MIT

package org.master;

import org.junit.Before;
import org.junit.Test;

public class StackTest {
    private Stack stack;

    @Before
    public void setUp() {
        stack = new Stack(5);
    }

    @Test()
    public void testPush() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        assert stack.size() == 5;
    }

    @Test(expected = StackOverflowError.class)
    public void testPushFull() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPushNegative() {
        stack.push(-1);
    }

    @Test
    public void testSize() {
        stack.push(1);
        assert stack.size() == 1;
    }

    @Test
    public void testEmptyStackTrue() {
        assert stack.isEmpty();
    }

    @Test
    public void testEmptyStackFalse() {
        stack.push(1);
        assert !stack.isEmpty();
    }

    @Test
    public void testPop() {
        stack.push(1);
        int element = stack.pop();
        assert element == 1;
    }

    @Test
    public void testPopEmpty() {
        int element = stack.pop();
        assert element == -1;
    }

    @Test
    public void testTop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int element = stack.top();
        assert element == 3;
    }

    @Test
    public void testTopEmpty() {
        int element = stack.top();
        assert element == -1;
    }
}
