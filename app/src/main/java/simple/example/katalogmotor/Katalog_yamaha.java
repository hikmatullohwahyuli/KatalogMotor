package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class Katalog_yamaha extends AppCompatActivity {
    ImageButton btnGear,btnFreego,btnMiom3,btnFino;
    public static final String JENIS_GALERI_KEY_YAMAHA = "JENIS_GALERI_YAMAHA";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_yamaha);


        btnGear = findViewById(R.id.gear);
        btnGear.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity aerox");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Gear");
            startActivity(intent);
        });
        btnFino = findViewById (R.id.freego);
        btnFino.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity nmax");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Freego");
            startActivity(intent);
        });
        btnMiom3 = findViewById (R.id.miom3);
        btnMiom3.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity xmax");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Mio M3");
            startActivity(intent);
        });
        btnFino = findViewById (R.id.finopremium);
        btnFino.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity newfino");
            Intent intent =new Intent (Katalog_yamaha.this,GaleriActivityYamaha.class);
            intent.putExtra(JENIS_GALERI_KEY_YAMAHA, "Fino");
            startActivity(intent);
        });
    }
}