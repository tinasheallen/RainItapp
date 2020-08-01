package com.example.rainit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
//private Button showMoney;
//private Button showTag;

    private TextView moneyText;
    private  int moneyCounter = 0;
    private TextView WowText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyText = findViewById(R.id.money_text);
        WowText = findViewById(R.id.Wow);

//        showMoney = findViewById(R.id.button_rain);
//        showTag = findViewById(R.id.button_show_tag);

//        showMoney.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.d("My Tag", "onClick: Show Money ");
//
//            }
//        });

    }
   public void showTag(View v){
       Toast.makeText(getApplicationContext(),"Hello there", Toast.LENGTH_LONG)
               .show();

   }

  public void showMoney(View v){

      NumberFormat numberFormat = NumberFormat.getCurrencyInstance();

        moneyCounter += 500;
      moneyText.setText(String.valueOf(numberFormat.format(moneyCounter)));


      switch (moneyCounter){

          case 2000:
              moneyText.setTextColor(Color.BLACK);
              break;

          case 4000:
              moneyText.setTextColor(Color.YELLOW);
             break;

          case 8000:
              moneyText.setTextColor(Color.GREEN);
              break;
          default:

      }

        if (moneyCounter > 8000){
            WowText.setVisibility(WowText.VISIBLE);

        } else{
            WowText.setVisibility(WowText.INVISIBLE);
        }



     // Log.d("MakeItRain", "showMoney:Tapped ");

  }
}
