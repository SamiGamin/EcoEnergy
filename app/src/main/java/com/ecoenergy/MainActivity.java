package com.ecoenergy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RadioGroup radioGroupHometype = findViewById(R.id.radioGroupHometype);
        RadioButton Casa = findViewById(R.id.casa);
        RadioButton Apartamento = findViewById(R.id.apartamento);
         RadioButton granja = findViewById(R.id.granja) ;


        EditText name= findViewById(R.id.editTextName);
        EditText direccion= findViewById(R.id.editTextDireccion);
        EditText telefono= findViewById(R.id.phone);
        EditText Email= findViewById(R.id.textEmailAddress);
        Button guardar = findViewById(R.id.enviar_solicitud);

        guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = "Name:" + name.getText().toString() + "\n" +
                        "Address: " + direccion.getText().toString() + "\n" +
                        "Phone: " + telefono.getText().toString() + "\n" +
                        "Email: " + Email.getText().toString();

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();

                if (Casa.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Casa", Toast.LENGTH_LONG).show();
                    Casa.setChecked(false);
                }
                if (Apartamento.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Apartamento", Toast.LENGTH_LONG).show();
                    Apartamento.setChecked(false);
                }
                if (granja.isChecked()){
                    Toast.makeText(MainActivity.this, "Seleccionaste Granja", Toast.LENGTH_SHORT).show();
                    granja.setChecked(false);
                }
            }
        });
    }
}