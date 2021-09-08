package com.example.myassignment

import org.junit.Assert.*
import org.junit.Test

class SecondFragmentTest{
    private val secondFragment =SecondFragment()

    @Test
    fun squareRoot_for_positive_number(){
        assertEquals("SquareRoot of the Value You Entered :${4}",secondFragment.getSquareRoot(16))
    }
    @Test
    fun squareRoot_for_negative_number(){
        assertEquals("SquareRoot of the Value You Entered :${0}",secondFragment.getSquareRoot(-16))
    }
    @Test
    fun squareRoot_for_zero(){
        assertEquals("SquareRoot of the Value You Entered :${0}",secondFragment.getSquareRoot(0))
    }


    @Test
    fun should_return_(){
        assertEquals("Full Course Name :SENG - 4322",secondFragment.getCourseName("SENG","4322"))
    }

    @Test
    fun should_not_return_full_course(){
        assertNotEquals("Full Course Name :1332-SENG",secondFragment.getCourseName("1332","SENG"))
    }
}