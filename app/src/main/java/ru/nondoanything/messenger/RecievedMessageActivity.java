package ru.nondoanything.messenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RecievedMessageActivity extends AppCompatActivity {

    private TextView textViewReceivedMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieved_message);
        textViewReceivedMessage = findViewById(R.id.textViewReceivedMessage);
        Intent intent = getIntent();
        String message = intent.getStringExtra("Message");
        textViewReceivedMessage.setText(message);
    }
}