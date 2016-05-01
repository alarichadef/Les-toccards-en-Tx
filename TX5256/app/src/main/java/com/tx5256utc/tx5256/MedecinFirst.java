package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 27/04/16.
 */
public class MedecinFirst extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medecin_first);

        Button infosPerso = (Button)findViewById(R.id.infosMedecin);
        infosPerso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infosPerso = new Intent(MedecinFirst.this, InfosPerso.class);
                startActivity(infosPerso);
            }
        });

        Button rechercherPatient = (Button)findViewById(R.id.rechercherPatient);
        rechercherPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rechercherPatient = new Intent(MedecinFirst.this, RechercherPatient.class);
                startActivity(rechercherPatient);
            }
        });
    }
}
