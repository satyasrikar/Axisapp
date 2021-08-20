package com.abdul.axisapp

class Calculator {

    fun add(a:Int,  b: Int):Int{
        return a+b
    }

    fun mul(a:Int, b:Int): Int{
        return a*b
    }

    fun div(a:Int, b:Int): Int{
        while(a!==0 && b!==0){
            return a/b;
        }
        
    }
    fun sub(a:Int, b:Int): Int{
        
          return a-b;
        
        
    }
}