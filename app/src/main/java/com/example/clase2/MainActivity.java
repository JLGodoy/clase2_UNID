package com.example.clase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button bot1 = findViewById(R.id.Boton1);
        final EditText nombreUsuario = findViewById(R.id.nombreUsuario);
        bot1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent inten1 = new Intent(v.getContext(),ventana2.class);
                Bundle bundle = new Bundle();
                bundle.getSerializable(nombreUsuario.getText().toString());
                inten1.putExtra("bundle1", bundle);

                startActivity(inten1);



            }
        });
    }






}
