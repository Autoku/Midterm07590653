package com.example.midterm07590653;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private static final String EMAIL = "aaa";
    private static final String PASSWORD = "111";

    private static final String EMAIL2 = "bbb";
    private static final String PASSWORD2 = "222";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button LoginButton = findViewById(R.id.login_bt);

        LoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.Emailedit);
                EditText passEditText = findViewById(R.id.Passedit);

                String inputEmail = emailEditText.getText().toString();

                String inputPass = passEditText.getText().toString();

                if(inputEmail.equals(EMAIL) && inputPass.equals(PASSWORD) || inputEmail.equals(EMAIL2) && inputPass.equals(PASSWORD2)){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra(inputEmail, inputPass);
                    startActivity(intent);

                }

                else{
                    AlertDialog.Builder dialog = new AlertDialog.Builder(LoginActivity.this);
                    dialog.setTitle("Login failed");
                    dialog.setMessage(R.string.Login_failed);
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int which) {
                            //todo:
                        }
                    });
                    dialog.show();
                }
            }

        });
    }
}
