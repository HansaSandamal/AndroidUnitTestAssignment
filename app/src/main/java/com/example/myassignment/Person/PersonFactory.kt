package com.example.myassignment.Person

class PersonFactory {
    fun getPerson(type: String?): Person? {
        if (type == null) {
            return null
        }
        return when {
            type.equals("STUDENT", ignoreCase = true) -> {
                Student()
            }
            type.equals("LECTURER", ignoreCase = true) -> {
                Lecturer()
            }

            else -> null
        }
    }
}