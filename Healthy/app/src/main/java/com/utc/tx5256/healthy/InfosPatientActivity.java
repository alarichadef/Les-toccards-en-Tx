package com.utc.tx5256.healthy;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by bido on 29/03/16.
 */
public class InfosPatientActivity extends Activity {
    ListView listPatient;
    String[] liste = new String[]{"MAJ Infos Perso >","Allergies >","Maladies >","Traitements >","Poids/Taille >","Notes >"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_patient);

        listPatient = (ListView)findViewById(R.id.listPatient);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(InfosPatientActivity.this, android.R.layout.simple_list_item_1, liste);
        listPatient.setAdapter(adapter);
    }
}
