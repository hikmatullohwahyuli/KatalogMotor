package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class GaleriActivityHonda extends AppCompatActivity {

    String jenisMotor;
    TextView txJenis,txNama,txPabrik,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_honda);
        Intent intent = getIntent();
        jenisMotor = intent.getStringExtra(KatalogHonda.JENIS_GALERI_KEY);
        inisialisasiView();
        if(jenisMotor.equalsIgnoreCase ("Genio")){
            txJenis.setText("Genio");
            txNama.setText("Genio");
            txPabrik.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Sistem Suplai Bahan Bakar\tPGM – FI ( Programmed Fuel Injection )\n" +
                    "Diameter X Langkah\t47,0 x 63,1 mm\n" +
                    "Tipe Tranmisi\tAutomatic, V-Matic\n" +
                    "Rasio Kompresi\t10,0 : 1\n" +
                    "Daya Maksimum\t6,6 kW ( 9,0 PS ) / 7.500 rpm\n" +
                    "Torsi Maksimum\t9,3 Nm ( 0,95 kgf.m ) / 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type");
            ivFotoHewan.setImageResource (R.drawable.genio);
        }
        else if(jenisMotor.equalsIgnoreCase ("Vario125")){
            txJenis.setText("Vario 125");
            txNama.setText("Vario 125");
            txPabrik.setText("Honda");
            txDeskripsi.setText("Tipe Mesin\t4-Langkah, SOHC, eSP, Pendinginan Cairan\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Tipe Tranmisi\tOtomatic , V - Matic\n" +
                    "Daya Maksimum\t8,2 kW (11,1 PS) / 8.500 rpm\n" +
                    "Torsi Maksimum\t10,8 Nm (1,1 kgf.m) / 5.000 rpm\n" +
                    "Tipe Starter\tElektrik\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type\n" +
                    "                    \"Harga\\tRp. 22.600.000");
            ivFotoHewan.setImageResource (R.drawable.vario125);
        }
        else if (jenisMotor.equalsIgnoreCase ("Beat")){
            txJenis.setText("Beat");
            txNama.setText("Beat");
            txPabrik.setText("Tahun : 2018");
            txDeskripsi.setText("Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Volume Langkah\t109.5cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi (PGM-FI)\n" +
                    "Diameter X Langkah\t47.0 x 63.1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t10.0 : 1\n" +
                    "Daya Maksimum\t6.6 kW (9.0 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9.3 N.m (0.95 kgf.m)/ 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering\n");
            ivFotoHewan.setImageResource (R.drawable.beat);
        }
        else if (jenisMotor.equalsIgnoreCase ("Beatstreet")){
            txJenis.setText("Beatstreet");
            txNama.setText("CC : 108,1");
            txPabrik.setText("Tahun : 2017");
            txDeskripsi.setText("Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Volume Langkah\t109.5cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi (PGM-FI)\n" +
                    "Diameter X Langkah\t47.0 x 63.1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t10.0 : 1\n" +
                    "Daya Maksimum\t6.6 kW (9.0 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9.3 N.m (0.95 kgf.m)/ 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering\n");
            ivFotoHewan.setImageResource (R.drawable.beatstreet);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txNama = findViewById(R.id.txNama);
        txPabrik = findViewById(R.id.txPabrik);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Motor "+jenisMotor);
    }


}