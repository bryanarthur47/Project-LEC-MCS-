package com.example.abc5dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends AppCompatActivity implements View.OnClickListener {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
    TextView PlayerNum;
    int value =0;
    int jumlahPlayer;
    int tempPlayer = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        jumlahPlayer = getIntent().getIntExtra("jumlahPlayer",3);

        PlayerNum = findViewById(R.id.PlayerNum);

         button0 = findViewById(R.id.button0);
         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button3 = findViewById(R.id.button3);
         button4 = findViewById(R.id.button4);
         button5 = findViewById(R.id.button5);
         button6 = findViewById(R.id.button6);
         button7 = findViewById(R.id.button7);
         button8 = findViewById(R.id.button8);
         button9 = findViewById(R.id.button9);
         button10 = findViewById(R.id.button10);

            button0.setOnClickListener(this);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);
            button6.setOnClickListener(this);
            button7.setOnClickListener(this);
            button8.setOnClickListener(this);
            button9.setOnClickListener(this);
            button10.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        tempPlayer++;

        switch (v.getId()){

            case R.id.button0:value = value + 0; break;
            case R.id.button1:value = value + 1; break;
            case R.id.button2:value = value + 2; break;
            case R.id.button3:value = value + 3; break;
            case R.id.button4:value = value + 4; break;
            case R.id.button5:value = value + 5; break;
            case R.id.button6:value = value + 6; break;
            case R.id.button7:value = value + 7; break;
            case R.id.button8:value = value + 8; break;
            case R.id.button9:value = value + 9; break;
            case R.id.button10:value = value + 10; break;

        }

         if (value != 0 && tempPlayer > jumlahPlayer){

            Intent intent = new Intent(Game.this, ShowLetter.class);
            intent.putExtra("totalValue",value);
            intent.putExtra("jumlahPlayer",jumlahPlayer);
            startActivity(intent);
            finish();

        }

         else if (value == 0 && tempPlayer-1==jumlahPlayer){
             Toast toast = Toast.makeText( getApplicationContext() , "Cannot Defind Word", Toast.LENGTH_SHORT );
             toast.show();

             Intent intent = new Intent(Game.this, Game.class);
             intent.putExtra("jumlahPlayer",jumlahPlayer);
             startActivity(intent);
             finish();

         }

        else PlayerNum.setText(""+tempPlayer);


    }
}