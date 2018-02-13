package com.example.u4_ejer2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnFormulario (View view){

        Intent i=new Intent(getApplicationContext(),FormularioActivity.class);
        startActivity(i);

    }

    public void btnLogin (View view){

        Intent i=new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(i);

    }
}
