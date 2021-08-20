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

    fun testMul(){
        var expected = 25
        var calculator = Calculator()
        var actual = calculator.mul(5,4)
        assertEquals(expected,actual)
    }

      fun testDiv(){
        var expected = 7
        var calculator = Calculator()
        var actual = calculator.div(21,3)
        assertEquals(expected,actual)
    }

      fun testSub(){
        var expected = 4
        var calculator = Calculator()
        var actual = calculator.div(25,1)
        assertEquals(expected,actual)
    }
}