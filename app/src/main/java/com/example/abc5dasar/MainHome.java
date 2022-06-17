package com.example.abc5dasar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainHome extends AppCompatActivity  {

    Button plusButton,minusButton,goButton;
    TextView value;
    int count =3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);

         plusButton = findViewById(R.id.plusButton);
         goButton = findViewById(R.id.goButton);
         minusButton = findViewById(R.id.minusButton);

        value = findViewById(R.id.value);

        goButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                 if(count >=3 && count<=10) {
                    Intent intent = new Intent(MainHome.this, Game.class);
                    intent.putExtra("jumlahPlayer",count);
                    startActivity(intent);
                 }
                 else{
                     if( count >10 ){

                         Toast toast = Toast.makeText( getApplicationContext() , "Max Player 10", Toast.LENGTH_SHORT );
                         toast.show();

                     }

                     else {
                         Toast toast = Toast.makeText( getApplicationContext() , "Minimal Player 3", Toast.LENGTH_SHORT );
                         toast.show();
                     }

                 }
            }

        });

    }

    public void increment(View v){
        count++;

        if (count >=10) {
            count=10;
            Toast toast = Toast.makeText( getApplicationContext() , "Max Player 10", Toast.LENGTH_SHORT );
            toast.show();
        }

        value.setText(""+count);

    }

    public void decrement(View v){
        count--;

        if (count <=3) {
            count=3;
            Toast toast = Toast.makeText( getApplicationContext() , "Minimal Player 3", Toast.LENGTH_SHORT);
            toast.show();
        }

        value.setText(""+count);

    }


}