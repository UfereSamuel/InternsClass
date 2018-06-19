package com.engineering.nhub.introduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        findViewById(R.id.btnform).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent form =  new Intent(Login.this, MainActivity.class);
                startActivity(form);
            }
        });
    }
}
