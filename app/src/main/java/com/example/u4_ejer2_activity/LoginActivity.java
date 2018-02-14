package com.example.u4_ejer2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    static final String EXTRA_USULOG = "USULOG";
    static final String EXTRA_PASSLOG = "PASSLOG";
    EditText etUsuario,etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = (EditText)findViewById(R.id.LetUsuario);
        etPass = (EditText)findViewById(R.id.LetPass);
    }

    public void clickAceptar (View view){

       String usuario = etUsuario.getText().toString();
       String pass = etPass.getText().toString();

        if (usuario.equals("") || pass.equals("")){
            Toast.makeText(getApplicationContext(), "Debes de rellenar todos los campos",
                    Toast.LENGTH_SHORT).show();
        }else{

            Intent i = new Intent(getApplicationContext(),
                    LoginDestinoActivity.class);

            i.putExtra(EXTRA_USULOG,usuario);
            i.putExtra(EXTRA_PASSLOG,pass);

            startActivity(i);
        }

    }
}
