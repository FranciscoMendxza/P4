package mx.edu.isc.tesoem.mojf.p4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity{

    Button btnab;
    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtnombre = findViewById(R.id.p1txtnombre);

        btnab = findViewById(R.id.p1btnab);
        btnab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lanza = new Intent(Principal.this, Basica.class);
                lanza.putExtra( "nombre", txtnombre.getText().toString());
                startActivity(lanza);
            }
        });
    }


    }
