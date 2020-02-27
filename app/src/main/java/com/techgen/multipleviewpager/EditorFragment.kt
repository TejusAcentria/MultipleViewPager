package com.techgen.multipleviewpager


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass.
 */
class EditorFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_editor, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editor = view.findViewById(R.id.textView) as TextView
        val name = arguments!!.getString("key_name", "")
        editor.text = name
    }

    companion object {


        private val KEY_POSITION = "position"

        fun newInstance(position: Int, s: String): EditorFragment {
            val frag = EditorFragment()
            val args = Bundle()
            args.putInt(KEY_POSITION, position)
            args.putString("key_name", s)
            frag.arguments = args
            return frag
        }

    }
}
