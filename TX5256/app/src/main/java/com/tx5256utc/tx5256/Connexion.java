package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

/**
 * Created by bido on 26/04/16.
 */
public class Connexion extends Activity {
    EditText login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        login = (EditText)findViewById(R.id.login);
        Button connexion = (Button)findViewById(R.id.connexion);
        connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log;
                log = login.getText().toString();
                Log.v("log",log);
                if(log.toString().equals("bruno")) {
                    Intent myIntent = new Intent(Connexion.this, MedecinFirst.class);
                    startActivity(myIntent);
                }
                else{
                    Intent myIntent = new Intent(Connexion.this, PatientFirst.class);
                    startActivity(myIntent);
                }
            }
        });
    }
}
