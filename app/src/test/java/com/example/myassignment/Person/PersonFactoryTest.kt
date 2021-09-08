package com.example.myassignment.Person

import org.hamcrest.CoreMatchers
import org.junit.Assert
import org.junit.Assert.*
import org.junit.Test

class PersonFactoryTest{
    @Test
    fun should_return_student_object(){
        val personFactory =PersonFactory()
        val student: Person? = personFactory.getPerson("STUDENT")
        Assert.assertThat(student, CoreMatchers.instanceOf(Student::class.java))
    }
    @Test
    fun should_return_lecturer_object(){
        val personFactory =PersonFactory()
        val lecturer: Person? = personFactory.getPerson("LECTURER")
        Assert.assertThat(lecturer, CoreMatchers.instanceOf(Lecturer::class.java))
    }
}