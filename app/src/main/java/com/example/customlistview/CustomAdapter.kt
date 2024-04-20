import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.customlistview.R

class CustomAdapter(private val context: Context, private val dataList: List<Triple<String, String, String>>, private val itemClickListener: (Triple<String, String, String>) -> Unit) : BaseAdapter() {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false)

        val item = dataList[position]
        val textViewName: TextView = view.findViewById(R.id.text_view2)
        val textViewId: TextView = view.findViewById(R.id.text_view3)
        val textViewProgram: TextView = view.findViewById(R.id.text_view4)

        textViewName.text = item.first
        textViewId.text = item.second
        textViewProgram.text = item.third

        view.setOnClickListener {
            itemClickListener.invoke(item)
        }

        return view
    }

    override fun getItem(position: Int): Any {
        return dataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return dataList.size
    }
}
