// SPDX-FileCopyrightText: 2024 Justin Getzke
//
// SPDX-License-Identifier: MIT

package org.master;

import org.junit.Before;
import org.junit.Test;

public class MyMathTest {
    private MyMaths myMaths;

    @Before
    public void setUp() {
        myMaths = new MyMaths();
    }

    // Statement coverage
    @Test
    public void testStatementCoverage() {
        // Test case 1
        int result = myMaths.gcd(4, 10);
        assert result == 2;
    }

    //  Branch coverage
    @Test
    public void testBranchCoverage() {
        // Test case 1
        int result = myMaths.gcd(4, 10);
        assert result == 2;

        // Test case 2
        result = myMaths.gcd(10, 5);
        assert result == 5;
    }

}
