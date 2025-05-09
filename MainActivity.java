package com.example.myapplication10;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Inflate the custom toast layout
                LayoutInflater inflater = getLayoutInflater();
                View customToastLayout = inflater.inflate(R.layout.custom_toast, null);

                // Customize the toast's text (optional)
                TextView toastText = customToastLayout.findViewById(R.id.toast_text);
                toastText.setText("This is a custom toast!");

                // Create and show the custom toast
                Toast customToast = new Toast(getApplicationContext());
                customToast.setDuration(Toast.LENGTH_LONG);
                customToast.setView(customToastLayout);
                customToast.show();
            }
        });
    }
}
