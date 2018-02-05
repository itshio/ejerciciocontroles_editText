package com.example.ejerciciocontroles_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etnombre,etapellido,etnombrecompleto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etnombre= (EditText)findViewById(R.id.et_nombre);
        etapellido= (EditText)findViewById(R.id.et_apellidos);
        etnombrecompleto= (EditText)findViewById(R.id.et_resultado);






    }//

    public void obtenernombrecompleto (View view){

        //RECOGER EL VALOR DE LOS EDITTEXT NOMBRE Y APELLIDOS

        String nombre= etnombre.getText().toString();
        String apellidos= etapellido.getText().toString();

        if(nombre.equals("")||apellidos.equals("")){
            Toast.makeText(getApplicationContext(),"debes de rellenar nombre y apellidos",
                    Toast.LENGTH_LONG).show();
        }else{

            etnombrecompleto.setText(nombre+" "+apellidos);
        }



    }




}//
