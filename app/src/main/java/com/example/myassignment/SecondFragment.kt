package com.example.myassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import com.example.myassignment.Person.Person
import com.example.myassignment.Person.PersonFactory
import kotlin.math.sqrt



/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SecondFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{val args = SecondFragmentArgs.fromBundle(it)
            view.findViewById<TextView>(R.id.fullName).text=getCourseName(args.courseName,args.courseCode)
            view.findViewById<TextView>(R.id.person).text= getRoll(args.roll.toUpperCase())
            view.findViewById<TextView>(R.id.SqtValue).text=getSquareRoot(args.valueSqt.toInt()).toString()
        }
    }

    fun getCourseName(courseName :String, courseCode : String): String{
        return "Full Course Name :$courseName - $courseCode"
    }

    private fun getRoll(roll:String): String? {
        val personFactory = PersonFactory()
        val person: Person? = personFactory.getPerson(roll)
        return person?.signIn();
    }

    fun getSquareRoot(value:Int): String {
        return "SquareRoot of the Value You Entered :${sqrt(value.toDouble()).toInt()}"

    }
 
}