package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GaleriActivityYamaha extends AppCompatActivity {

    String jenisMotorYamaha;
    TextView txJenis,txNama,txPabrik,txDeskripsi,txJudul;
    ImageView ivFotoHewan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri_yamaha);
        Intent intent = getIntent();
        jenisMotorYamaha = intent.getStringExtra(Katalog_yamaha.JENIS_GALERI_KEY_YAMAHA);
        if(jenisMotorYamaha.equalsIgnoreCase ("Gear")){
            inisialisasiView();
            txJenis.setText("Gear");
            txNama.setText("Gear");
            txPabrik.setText("Yamaha");
            txDeskripsi.setText("Tipe Mesin\t4-stroke, SOHC\n" +
                    "Susunan Silinder\tSingle Cylinder\n" +
                    "Diameter x Langkah\t52,4 x 57,9 mm\n" +
                    "Perbandingan Kompresi\t9,5 : 1\n" +
                    "Volume Silinder\t124.96 cc\n" +
                    "Daya Maksimum\t7,0 kW / 8000 rpm\n" +
                    "Torsi Maksimum\t9,5 Nm/ 5500 rpm\n" +
                    "Sistem Starter\tElectric & Kick Starter\n" +
                    "Sistem Pelumasan\tWet Sump\n" +
                    "Kapasitas Oli Mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Sistem Bahan Bakar\tFuel Injection\n" +
                    "Tipe Kopling\tSingle dry clutch\n" +
                    "Tipe Transmisi\tFull Automatic");
            ivFotoHewan.setImageResource (R.drawable.gear125s);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Freego")){
            inisialisasiView();
            txJenis.setText("Freego");
            txNama.setText("Freego");
            txPabrik.setText("Yamaha");
            txDeskripsi.setText("Tipe Mesin\tAir Cooled 4-Stroke,SOHC\n" +
                    "Susunan Silinder\tSingle Cylinder\n" +
                    "Diameter x Langkah\t52,4 x 57,9 mm\n" +
                    "Perbandingan Kompresi\t9,5 : 1\n" +
                    "Volume Silinder\t125 cc\n" +
                    "Daya Maksimum\t7,0 kW / 8000 rpm\n" +
                    "Torsi Maksimum\t9,5 Nm/ 5500 rpm\n" +
                    "Sistem Starter\tElectric & Kick Starter (Standart)\n" +
                    "Sistem Pelumasan\tWet Sump\n" +
                    "Kapasitas Oli Mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Sistem Bahan Bakar\tFuel Injection\n" +
                    "Tipe Kopling\tSingle dry clutch\n" +
                    "Tipe Transmisi\tFull Automatic");
            ivFotoHewan.setImageResource (R.drawable.ferego);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Mio M3")){
            inisialisasiView();
            txJenis.setText("Mio M3");
            txNama.setText("Mio M3");
            txPabrik.setText("Yamaha");
            txDeskripsi.setText("Tipe mesin\tAir cooled 4-stroke, SOHC\n" +
                    "Kapasitas oli mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Susunan silinder\tSingle cylinder\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Perbandingan kompresi\t9,5 : 1\n" +
                    "Volume silinder\t125 cc\n" +
                    "Daya maksimum\t7 kW / 8000 rpm\n" +
                    "Torsi maksimum\t9.6 Nm / 5500 rpm\n" +
                    "Sistem starter\tElectric & kick starter\n" +
                    "Sistem pelumasan\tWet sump");
            ivFotoHewan.setImageResource (R.drawable.miom3);
        }else if(jenisMotorYamaha.equalsIgnoreCase ("Fino")){
            inisialisasiView();
            txJenis.setText("New fino");
            txNama.setText("Fino");
            txPabrik.setText("Yamaha");
            txDeskripsi.setText("Volume Cylinder\t125 cc\n" +
                    "Perbandingan Kompresi\t9,5 : 1\n" +
                    "Daya Maksimum\t7.0 kW (9.52 PS) / 8000rpm\n" +
                    "Torsi Maksimum\t9.6 N.m (0,98 kgf.m) / 5500rpm\n" +
                    "Sistem Starter\tElektrik & kick starter\n" +
                    "Sistem Pelumasan\tBasah\n" +
                    "Kapasitas Oli Mesin\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "Sistem Bahan Bakar\tFuel Injection\n" +
                    "Tipe Kopling\tKering, sentrifugal Automatic\n" +
                    "Tipe Transmisi\tV-belt automatic\n" +
                    "Tipe Mesin\tAir cooled, 4-stroke, SOHC\n" +
                    "Jumlah / Posisi Silinder\tSingle cylinder\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm");
            ivFotoHewan.setImageResource (R.drawable.finopremium);
        }

    }

    private void inisialisasiView() {
        txJenis = findViewById(R.id.txJenis);
        txNama = findViewById(R.id.txNama);
        txPabrik = findViewById(R.id.txPabrik);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoHewan = findViewById(R.id.gambarMotor);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Motor "+jenisMotorYamaha);
    }
}