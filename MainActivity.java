package com.example.magic_8_ball;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewBall;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewBall = findViewById(R.id.image_view_ball);
        imageViewBall.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                shakeBall();
            }
        });
    }

    private void shakeBall() {
        int randomNum = rng.nextInt(10) + 1;

        switch (randomNum) {
            case 1:
                imageViewBall.setImageResource(R.drawable.ball_1);
                break;
            case 2:
                imageViewBall.setImageResource(R.drawable.ball_2);
                break;
            case 3:
                imageViewBall.setImageResource(R.drawable.ball_3);
                break;
            case 4:
                imageViewBall.setImageResource(R.drawable.ball_4);
                break;
            case 5:
                imageViewBall.setImageResource(R.drawable.ball_5);
                break;
            case 6:
                imageViewBall.setImageResource(R.drawable.ball_6);
                break;
            case 7:
                imageViewBall.setImageResource(R.drawable.ball_7);
                break;
            case 8:
                imageViewBall.setImageResource(R.drawable.ball_8);
                break;
            case 9:
                imageViewBall.setImageResource(R.drawable.ball_9);
                break;
            case 10:
                imageViewBall.setImageResource(R.drawable.ball_10);
                break;
        }
    }
}
