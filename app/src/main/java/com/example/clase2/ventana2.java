package com.example.clase2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ventana2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        Intent intent1 = getIntent();
        String name = intent1.getStringExtra("bundle1");
        Toast.makeText(this, "Bienvenido" + name, Toast.LENGTH_LONG).show();

        final Button button2 = findViewById(R.id.boton2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
