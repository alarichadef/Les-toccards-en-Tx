package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 01/05/16.
 */
public class RechercherPatient extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rechercher_patient);

        final Button recherchePatient = (Button)findViewById(R.id.rechercher);
        recherchePatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recherchePat = new Intent(RechercherPatient.this, ListePatients.class);
                startActivity(recherchePat);
            }
        });
    }
}
