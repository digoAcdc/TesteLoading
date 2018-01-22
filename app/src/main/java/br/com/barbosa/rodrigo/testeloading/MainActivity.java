package br.com.barbosa.rodrigo.testeloading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.race604.drawable.wave.WaveDrawable;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.img);

        WaveDrawable chromeWave = new WaveDrawable(this, R.drawable.sacola);

        imageView.setImageDrawable(chromeWave);

        chromeWave.setIndeterminate(true);
        chromeWave.setLevel(4028);
        chromeWave.setWaveAmplitude(30);
        chromeWave.setWaveLength(400);
        chromeWave.setWaveSpeed(20);
    }
}
