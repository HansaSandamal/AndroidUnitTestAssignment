package com.example.myassignment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
            var courseName=view.findViewById<EditText>(R.id.cousreName).text.toString()
            var courseCode=view.findViewById<EditText>(R.id.courseCode).text.toString()
            var roll=view.findViewById<EditText>(R.id.roll).text.toString()
            var valueSqt=view.findViewById<EditText>(R.id.valueSqt).text.toString()
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                courseName,
                courseCode,
                roll,
                valueSqt,
            )
            findNavController().navigate(action)
        }
    }
}
