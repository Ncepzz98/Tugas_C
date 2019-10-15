package cobakotlin.acep.com.daftarpresidenindo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val language    = arrayOf<String>("Ir. Soekarno","Soeharto",
        "BJ. Habibie","Abdurahman Wahid",
        "Megawati Soekarno Putri","Susilo Bambang Yudhoyono","Joko Widodo")

    val imageId = arrayOf<Int>(
        R.drawable.sukarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val presadapter = PresidenAdapter(this,language,imageId)
        listView.adapter = presadapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            val ListPres = adapterView.getItemAtPosition(position)
            val IdPres = adapterView.getItemIdAtPosition(position)
            var tempx = Integer.parseInt(IdPres.toString())

            if (tempx.equals(0)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden Pertama, Nama panggilan : Bung Karno\n" +
                        "Nama kecil : Kusno\n" +
                        "Tempat, tanggal lahir : Blitar, 6 Juni 1901", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(1)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden kedua, Nama Lengkap : Jenderal Besar TNI (Purn.) H. M. Soeharto\n" +
                        "Lahir : Kemusuk, Yogyakarta, 8 Juni 1921\n" +
                        "Wafat : Jakarta, 27 Januari 2008", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(2)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden ketiga, Nama Lengkap: Prof. Dr.-Ing. H. Bacharuddin Jusuf Habibie\n" +
                        "Nama Populer: BJ Habibie\n" +
                        "Istri: Hasri Ainun Besari\n" +
                        "Tempat, Tanggal Lahir: Pare-pare, 25 Juni 1936", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(3)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden keempat, Dr.(H.C.) K.H. Abdurrahman Wahid\n" +
                        "Lahir : Jombang, Jawa Timur, 7 September 1940\n" +
                        "Meninggal : Jakarta, 30 Desember 2009", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(4)){
                Toast.makeText(this, "Ini Ibu $ListPres , Presiden kelima, Dr. Hj. Dyah Permata Megawati Setyawati Soekarnoputri  (Megawati Soekarnoputri)\n" +
                        "Lahir : Yogyakarta, 23 Januari 1947\n" +
                        "Agama : Islam\n" +
                        "Orang Tua : Ir. Soekarno (ayah), Fatmawati (ibu)", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(5)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden keenam, Prof. Dr. H. Susilo Bambang Yudhoyono\n" +
                        "Lahir : Pacitan, Jawa Timur, 9 September 1949\n" +
                        "Agama : Islam", Toast.LENGTH_LONG).show()
            }
            else if (tempx.equals(6)){
                Toast.makeText(this, "Ini Bapak $ListPres , Presiden ketjuh, Ir. H. Joko Widodo (Jokowi)\n" +
                        "Nama Panggilan : Jokowi\n" +
                        "Tempat Tanggal Lahir: Surakarta, 21 Juni 1961\n" +
                        "Orang Tua : Noto Mihardjo (Ayah), Sujiatmi Notomihardjo (Ibu)", Toast.LENGTH_LONG).show()
            }
            else {
                Toast.makeText(this, "Pilihan Tidak Ada", Toast.LENGTH_LONG).show()
            }
        }
    }
}

