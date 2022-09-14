/*
 * Copyright 2018, Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.SimpleCalc;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)
@androidx.test.filters.SmallTest
//@SmallTest
public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, is(equalTo(2d)));
    }

    /**
     * Test for POW function
     **/

    //general test
    @Test
    public void powOfNumber() {
        double resultPow = mCalculator.pow(2, 1);
        assertThat(resultPow, is(equalTo(2d)));
    }

    @Test
    //for positive integer operands
    public void powOfPosNumber() {
        double resultPow = mCalculator.pow(5, 4);
        assertThat(resultPow, is(equalTo(625d)));
    }

    @Test
    //for negative integer 1st operand
    public void powOfNegFirstOperandNumber() {
        double resultPow = mCalculator.pow(-5, 4);
        assertThat(resultPow, is(equalTo(625d)));
    }

    @Test
    //for negative integer 2nd operand
    public void powOfNegSecondOperandNumber() {
        double resultPow = mCalculator.pow(5, -4);
        assertThat(resultPow, is(equalTo(0.0016)));
    }

    @Test
    //for zero integer operands
    public void powOfZeroNumber() {
        double resultPow = mCalculator.pow(0, 2);
        assertThat(resultPow, is(equalTo(0d)));
    }

    @Test
    //for zero second operand
    public void powOfZeroSecondNumber() {
        double resultPow = mCalculator.pow(2, 0);
        assertThat(resultPow, is(equalTo(1d)));
    }

    @Test
    //for 0 for 1st and -1 for 2nd operands
    public void powOfZeroNegNumber() {
        double resultPow = mCalculator.pow(0, -1);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }

    @Test
    //for 0 for 1st and -1 for 2nd operands
    public void powOfNegZeroNumber() {
        double resultPow = mCalculator.pow(-0, -2);
        assertThat(resultPow, is(equalTo(Double.POSITIVE_INFINITY)));
    }
}