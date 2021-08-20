package com.abdul.axisapp

import junit.framework.TestCase
import org.junit.Test

class CalculatorTest : TestCase() {

    @Test
    fun testAdd() {
        var expected = 30
        var calculator = Calculator()
        var actual = calculator.add(10,20)
        assertEquals(expected,actual)
    }
}