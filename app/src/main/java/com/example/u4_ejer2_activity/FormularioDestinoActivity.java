package com.example.u4_ejer2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FormularioDestinoActivity extends AppCompatActivity {

    TextView tvEmail, tvPassword, tvUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_destino);

        tvEmail = (TextView)findViewById(R.id.FtvEmail);
        tvPassword = (TextView)findViewById(R.id.FtvPassword);
        tvUsuario = (TextView)findViewById(R.id.FtvUsuario);

        Bundle b = getIntent().getExtras();
        if (b!=null){

            String email = b.getString(FormularioActivity.EXTRA_EMAIL);
            String pass = b.getString(FormularioActivity.EXTRA_PASS2);
            String usuario = b.getString(FormularioActivity.EXTRA_USUARIO);

            tvEmail.setText(email);
            tvPassword.setText(pass);
            tvUsuario.setText(usuario);


        }
    }

    public void btnInicioFormulario (View view){

        Intent inicio = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(inicio);
    }
}
