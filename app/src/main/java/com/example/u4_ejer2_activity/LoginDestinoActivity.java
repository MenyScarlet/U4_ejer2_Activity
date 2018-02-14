package com.example.u4_ejer2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginDestinoActivity extends AppCompatActivity {

    TextView tvUsuario, tvPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_destino);

        tvUsuario = (TextView)findViewById(R.id.LtvUsuario);
        tvPassword = (TextView)findViewById(R.id.LtvPassword);

        Bundle b = getIntent().getExtras();
        if (b!=null){

            String usuario = b.getString(LoginActivity.EXTRA_USULOG);
            String pass = b.getString(LoginActivity.EXTRA_PASSLOG);

            tvUsuario.setText(usuario);
            tvPassword.setText(pass);
        }
    }

    public void clickInicioLogin (View view){

        Intent i = new Intent (getApplicationContext(),
                MainActivity.class);
        startActivity(i);

    }
}
