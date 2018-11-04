package com.danibelmonte.materialdesignejemplos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.danibelmonte.materialdesignejemplos.Animaciones.AnimacionesActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt_animaciones).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AnimacionesActivity.start(getApplicationContext());
            }
        });
    }
}
