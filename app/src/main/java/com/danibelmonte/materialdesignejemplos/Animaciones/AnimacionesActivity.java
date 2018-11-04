package com.danibelmonte.materialdesignejemplos.Animaciones;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.danibelmonte.materialdesignejemplos.R;

public class AnimacionesActivity extends AppCompatActivity {

    public static void start(Context context){
        Intent intent = new Intent(context, AnimacionesActivity.class);
        context.startActivity(intent);
    }

    private Button bt_big_animation,bt_fadeout_animation, bt_rotation;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animaciones);

        image = (ImageView) findViewById(R.id.image);
        bt_big_animation = (Button) findViewById(R.id.bt_big_animation);
        bt_big_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.big);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        image.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout));
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                animation.setFillAfter(true);
                image.startAnimation(animation);
            }
        });
        bt_fadeout_animation = (Button) findViewById(R.id.bt_fadeout_animation);
        bt_fadeout_animation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fadeout);
                image.startAnimation(animation);
            }
        });

        bt_rotation = (Button) findViewById(R.id.bt_rotate);
        bt_rotation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}
