package com.utc.tx5256.healthy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 29/03/16.
 */
public class ConnexionActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_connexion);

        Button validateButton = (Button)findViewById(R.id.buttonValider);
        validateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(ConnexionActivity.this, InfosPatientActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
