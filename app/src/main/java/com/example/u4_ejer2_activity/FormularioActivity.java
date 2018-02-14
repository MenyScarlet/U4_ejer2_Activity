package com.example.u4_ejer2_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    static final String EXTRA_EMAIL="EMAIL";
    static final String EXTRA_PASS1="PASS1";
    static final String EXTRA_PASS2="PASS2";
    static final String EXTRA_USUARIO="USUSARIO";
    EditText FetEmail, FetPassword1, FetPassword2, FetUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        FetEmail = (EditText)findViewById(R.id.FetEmail);
        FetPassword1 = (EditText)findViewById(R.id.FetPass1);
        FetPassword2 = (EditText)findViewById(R.id.FetPass2);
        FetUsuario = (EditText)findViewById(R.id.FetUsuario);



    }//FIN onCreate

    public void btnRegistro (View view){

        String email = FetEmail.getText().toString();
        String pass1 = FetPassword1.getText().toString();
        String pass2 = FetPassword2.getText().toString();
        String usuario = FetUsuario.getText().toString();

        if (email.equals("") || pass1.equals("") || pass2.equals("") || usuario.equals("") ){

            Toast.makeText(getApplicationContext(), "Debes de rellenar todos los campos",
                    Toast.LENGTH_SHORT).show();

        }else{

            if (pass1.equals(pass2)){

                Intent i = new Intent(getApplicationContext(),
                        FormularioDestinoActivity.class);
                i.putExtra(EXTRA_EMAIL, email);
                i.putExtra(EXTRA_PASS2, pass2);
                i.putExtra(EXTRA_USUARIO, usuario);

                startActivity(i);


            }else{
                Toast.makeText(getApplicationContext(), "Las contraseñas no coinciden",
                        Toast.LENGTH_SHORT).show();
            }
        }


    }
}//FIN MainActiviy
