package com.example.workshop;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, result;
    Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        add = findViewById(R.id.add);

        add.setOnClickListener(v -> {

            String a = num1.getText().toString();
            String b = num2.getText().toString();

            if (!a.isEmpty() && !b.isEmpty()) {

                double n1 = Double.parseDouble(a);
                double n2 = Double.parseDouble(b);

                double sum = n1 + n2;

                result.setText(String.valueOf(sum));

            } else {
                result.setText("Enter both numbers");
            }
        });
    }
}
