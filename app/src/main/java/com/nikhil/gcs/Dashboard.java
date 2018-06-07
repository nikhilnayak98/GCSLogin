package com.nikhil.gcs;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Dashboard extends AppCompatActivity {

    String NameHolder;
    String EmailHolder;
    TextView Email;
    Button LogOUT ;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListner;
    FirebaseUser mUser;
    public static final String TAG = "LOGIN";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Email = (TextView) findViewById(R.id.textView1);
        LogOUT = (Button) findViewById(R.id.button1);

        Intent intent = getIntent();

        EmailHolder = intent.getStringExtra(MainActivity.userEmail);
        Email.setText(Email.getText().toString()+ EmailHolder);

        LogOUT.setOnClickListener(new View.OnClickListener() {
            // @Override
            public void onClick(View v) {
                finish();
                Toast.makeText(Dashboard.this,"Log Out Successfull", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Dashboard.this, MainActivity.class);
                startActivity(intent);
                /*if (v.getId() == R.id.button1) {
                    Auth.getInstance()
                            .signOut(this)
                            .addOnCompleteListener(new OnCompleteListener<Void>() {
                                public void onComplete(@NonNull Task<Void> task) {
                                    startActivity(new Intent(Dashboard.this, MainActivity.class));
                                    finish();
                                }
                            });
                }*/
            }
        });
    }
}