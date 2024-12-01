package com.example.mytictaktoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, again;
    String bb1, bb2, bb3, bb4, bb5, bb6, bb7, bb8, bb9;
    int flag = 0;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button nextbt;
        nextbt = findViewById(R.id.nextbt);
        again = findViewById(R.id.again);
        again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                again();
            }
        });
        Intent nextit;
        nextit = new Intent(MainActivity.this, MainActivity2.class);
        nextbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(nextit);
            }
        });



        init();



    }


    private void init() {

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
    }

    public void Check(View view) {
        Button bcurrent = (Button) view;
        if (bcurrent.getText().toString().isEmpty()) {
            if (flag == 0) {
                bcurrent.setText("X");
                flag = 1;
                count++;
            } else {
                bcurrent.setText("O");
                flag = 0;
                count++;
            }
            if (count > 4) {
                bb1 = b1.getText().toString();
                bb2 = b2.getText().toString();
                bb3 = b3.getText().toString();
                bb4 = b4.getText().toString();
                bb5 = b5.getText().toString();
                bb6 = b6.getText().toString();
                bb7 = b7.getText().toString();
                bb8 = b8.getText().toString();
                bb9 = b9.getText().toString();
                if (bb1.equals(bb2) && bb2.equals(bb3) && !bb1.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb4.equals(bb5) && bb5.equals(bb6) && !bb4.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb4, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb7.equals(bb8) && bb8.equals(bb9) && !bb7.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb1.equals(bb4) && bb4.equals(bb7) && !bb1.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb2.equals(bb5) && bb5.equals(bb8) && !bb2.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb2, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb3.equals(bb6) && bb6.equals(bb9) && !bb3.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb1.equals(bb5) && bb5.equals(bb9) && !bb1.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (bb3.equals(bb5) && bb5.equals(bb7) && !bb3.equals("")) {
                    Toast.makeText(this, " Game Winner is : " + bb3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (count == 9) {
                    Toast.makeText(this, "MATCH IS DRAWN", Toast.LENGTH_SHORT).show();
                    restart();
                }


            }

        }
    }
    public void again(){
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        flag = 0;
        count = 0;
    }
    private void restart() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");
                flag = 0;
                count = 0;
            }
        },3000);


    }


    }
















