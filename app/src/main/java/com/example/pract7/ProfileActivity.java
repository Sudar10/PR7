package com.example.pract7;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    public void GoContacts(View v)
    {
        Intent intent=new Intent(this, ContactsActivity.class);
        startActivity(intent);
    }
}
