package mx.edu.isc.tesoem.mojf.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Basica extends AppCompatActivity {
    TextView lblrecibe;
    Button p2btnregresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basica);

        lblrecibe = findViewById(R.id.lblrecibe);
        p2btnregresa = findViewById(R.id.p2btnregresa);

        Bundle parametros = getIntent().getExtras();
        lblrecibe.setText(parametros.getString("nombre"));

        p2btnregresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(Basica.this, Principal.class);
                startActivity(lanza);
            }
        });

    }
}