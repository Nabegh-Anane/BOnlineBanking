package com.example.bob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView RegisterText;
    TextView ForgetPass;
    private Button Account;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hiding the title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);
        Account = (Button) findViewById(R.id.Account);
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCompte();
            }

        });
        RegisterText = (TextView) findViewById(R.id.RegisterText);
        RegisterText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DontHaveAccount();
            }

        });
        ForgetPass = (TextView) findViewById(R.id.ForgetPass);
        ForgetPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResetPassword();
            }

        });
    }
    public void DontHaveAccount(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void ResetPassword(){
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    public void openCompte(){
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
}