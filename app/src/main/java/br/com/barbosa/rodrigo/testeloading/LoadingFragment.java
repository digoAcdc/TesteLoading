package br.com.barbosa.rodrigo.testeloading;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.race604.drawable.wave.WaveDrawable;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoadingFragment extends Fragment {

    private ImageView imageView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_loading, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView = view.findViewById(R.id.img);

        WaveDrawable chromeWave = new WaveDrawable(getContext(), R.drawable.sacola);

        imageView.setImageDrawable(chromeWave);

        chromeWave.setIndeterminate(true);
        chromeWave.setLevel(4028);
        chromeWave.setWaveAmplitude(30);
        chromeWave.setWaveLength(400);
        chromeWave.setWaveSpeed(20);
    }
}
