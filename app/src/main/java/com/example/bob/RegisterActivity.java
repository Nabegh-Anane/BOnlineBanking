package com.example.bob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView Logintext;
    private Button Account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hiding the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_register);
        Account = (Button) findViewById(R.id.Account);
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCompta();
            }

        });
        Logintext = (TextView) findViewById(R.id.Logintext);
        Logintext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haveAccount();
            }

        });
    }
    public void haveAccount(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openCompta(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}