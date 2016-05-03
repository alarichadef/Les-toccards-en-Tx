package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 27/04/16.
 */
public class PatientFirst extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_first);

        Button rdv = (Button)findViewById(R.id.rdv);
        rdv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rdv = new Intent(PatientFirst.this, RendezVous.class);
                startActivity(rdv);
            }
        });

        Button infosPerso = (Button)findViewById(R.id.info);
        infosPerso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent infosP = new Intent(PatientFirst.this, InfosPerso.class);
                startActivity(infosP);
            }
        });

        Button allergies = (Button)findViewById(R.id.allergies);
        allergies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent allerg = new Intent(PatientFirst.this, AllergiesActivity.class);
                startActivity(allerg);
            }
        });

        Button maladies = (Button)findViewById(R.id.maladies);
        maladies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent maladies = new Intent(PatientFirst.this, MaladiesActivity.class);
                startActivity(maladies);
            }
        });

        Button traitements = (Button)findViewById(R.id.traitements);
        traitements.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent traitements = new Intent(PatientFirst.this, TraitementsActivity.class);
                startActivity(traitements);
            }
        });

        Button notes = (Button)findViewById(R.id.notes);
        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent notes = new Intent(PatientFirst.this, NotesActivity.class);
                startActivity(notes);
            }
        });

        Button poidsTaille = (Button)findViewById(R.id.poidstaille);
        poidsTaille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent poidsTaille = new Intent(PatientFirst.this, PoidsTailleActivity.class);
                startActivity(poidsTaille);
            }
        });
    }
}