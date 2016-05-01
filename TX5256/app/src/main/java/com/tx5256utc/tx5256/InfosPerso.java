package com.tx5256utc.tx5256;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by bido on 29/04/16.
 */
public class InfosPerso extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos_perso);

        Button majInfos = (Button)findViewById(R.id.maj);
        majInfos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent majInfosPerso = new Intent(InfosPerso.this, MAJInfosPerso.class);
                startActivity(majInfosPerso);
            }
        });
    }
}
