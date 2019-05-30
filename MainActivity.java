package com.example.buittonfield;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int count=0;
        private Button btn;
        private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.loginbtn);
        txt=(TextView)findViewById(R.id.txtview);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                txt.setText("Login button is clicked for "+count+" times");
            }
        });
    }
}
