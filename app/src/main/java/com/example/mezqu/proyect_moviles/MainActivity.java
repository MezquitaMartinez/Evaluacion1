package com.example.mezqu.proyect_moviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnTraducir,btnAbc,btnPal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            }
    public void onClickButton(View view){
        if(view.getId()==R.id.btnTraducir){
            Intent activity1 = new Intent(this, traducir.class);
            startActivity(activity1);


        }else if(view.getId()==R.id.btnAbc){
            Intent activity2 = new Intent(this, abc.class);
            startActivity(activity2);

        }else if(view.getId()==R.id.btnPal){
            Intent activity3 = new Intent(this, pal.class);
            startActivity(activity3);

        }

    }

}
