package cobakotlin.acep.com.daftarpresidenindo


import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.*
class PresidenAdapter(private val context: Activity, private val title: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.pres, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.pres, null, true)

        val titleText = rowView.findViewById(R.id.title) as TextView
        val imageView = rowView.findViewById(R.id.icon) as ImageView

        titleText.text = title[position]
        imageView.setImageResource(imgid[position])

        return rowView
    }
}