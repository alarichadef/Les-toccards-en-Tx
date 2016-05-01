package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 01/05/16.
 */
public class ListePatients extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_patients);

        Button skip = (Button)findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skip = new Intent(ListePatients.this, SynthesePatient.class);
                startActivity(skip);
            }
        });
    }
}
