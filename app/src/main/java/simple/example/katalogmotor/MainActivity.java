package simple.example.katalogmotor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView btnKatalogHonda,btnKatalogYamaha;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        btnKatalogHonda = findViewById(R.id.tombol_katalog_honda);
        btnKatalogYamaha = findViewById(R.id.tombol_katalog_yamaha);
        btnKatalogHonda.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this,KatalogHonda.class);
            startActivity (intent);
        });
        btnKatalogYamaha.setOnClickListener(v -> {
            Intent intent = new Intent (MainActivity.this,Katalog_yamaha.class);
            startActivity (intent);
        });
    }
}