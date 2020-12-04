package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.util.Log;
import android.widget.ImageButton;

public class KatalogHonda extends AppCompatActivity {
    ImageButton btnGenio, btnVario150,btnBeat,btnBeatstreet;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI_HONDA";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_katalog_honda);

        btnGenio = findViewById(R.id.genio);
        btnGenio.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity scoopy");
            Intent beat =new Intent (KatalogHonda.this,GaleriActivityHonda.class);
            beat.putExtra(JENIS_GALERI_KEY, "Genio");
            startActivity(beat);
        });


        btnVario150 = findViewById(R.id.vario125);
        btnVario150.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity vario150");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "Vario125");
            startActivity(intent);
        });

        btnBeat = findViewById(R.id.beat);
        btnBeat.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity beateSP");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "Beat");
            startActivity(intent);
        });


        btnBeatstreet = findViewById(R.id.beatstreet);
        btnBeatstreet.setOnClickListener(v -> {
            Log.d("MAIN","Buka activity beatstreet");
            Intent intent = new Intent(this, GaleriActivityHonda.class);
            intent.putExtra(JENIS_GALERI_KEY, "beatstreet");
            startActivity(intent);
        });
    }
}