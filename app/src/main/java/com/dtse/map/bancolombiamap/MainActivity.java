package com.dtse.map.bancolombiamap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.huawei.hms.maps.MapsInitializer;

public class MainActivity extends AppCompatActivity {

    private Button mapActivityBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MapsInitializer.setApiKey("DAEDAIRUmAmWOMhUPiIa49UbuRBU+bw+n+5832S7OMYSpUn6LfV8lEbZ8c9rSzCDemVCI0gW627rBm077iBQ+k6s4PSAQeLSshzjtw==");
        MapsInitializer.initialize(getApplicationContext());
        //MapsInitializer.initialize(getApplicationContext());
        mapActivityBTN = findViewById(R.id.mapActivityBTN);
        mapActivityBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
    }
}