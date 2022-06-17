package com.example.abc5dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowLetter extends AppCompatActivity {

    Button buttonAgain;
    int totalValue;
    int tempValue;
    int jumlahPlayer;
    TextView LetterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_letter);

        totalValue = getIntent().getIntExtra("totalValue",1);
        jumlahPlayer = getIntent().getIntExtra("jumlahPlayer",3);

        buttonAgain = findViewById(R.id.buttonAgain);
        LetterText = findViewById(R.id.LetterText);

        tempValue= totalValue%26;

        if (tempValue ==1 ) LetterText.setText("A");
        else if (tempValue ==2 ) LetterText.setText("B");
        else if (tempValue ==3 ) LetterText.setText("C");
        else if (tempValue ==4 ) LetterText.setText("D");
        else if (tempValue ==5 ) LetterText.setText("E");
        else if (tempValue ==6 ) LetterText.setText("F");
        else if (tempValue ==7 ) LetterText.setText("G");
        else if (tempValue ==8 ) LetterText.setText("H");
        else if (tempValue ==9 ) LetterText.setText("I");
        else if (tempValue ==10 ) LetterText.setText("J");
        else if (tempValue ==11 ) LetterText.setText("K");
        else if (tempValue ==12 ) LetterText.setText("L");
        else if (tempValue ==13 ) LetterText.setText("M");
        else if (tempValue ==14 ) LetterText.setText("N");
        else if (tempValue ==15 ) LetterText.setText("O");
        else if (tempValue ==16 ) LetterText.setText("P");
        else if (tempValue ==17 ) LetterText.setText("Q");
        else if (tempValue ==18 ) LetterText.setText("R");
        else if (tempValue ==19 ) LetterText.setText("S");
        else if (tempValue ==20 ) LetterText.setText("T");
        else if (tempValue ==21 ) LetterText.setText("U");
        else if (tempValue ==22 ) LetterText.setText("V");
        else if (tempValue ==23 ) LetterText.setText("W");
        else if (tempValue ==24 ) LetterText.setText("X");
        else if (tempValue ==25 ) LetterText.setText("Y");
        else if (tempValue ==0 ) LetterText.setText("Z");

        buttonAgain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent(ShowLetter.this, Game.class);
                intent.putExtra("jumlahPlayer",jumlahPlayer);
                startActivity(intent);
                finish();
            }
        });

    }

}