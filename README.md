## Aim:
To implement addition of two numbers in android studio.

## Requirements:
Android Studio(Gradle)

## Procedure:
1.Open Android Studio and create a new project using Empty Views Activity.
2.Select Java as the programming language.
3.Open activity_main.xml and design the user interface using:
TextView – To display the application title.
EditText – To enter the first number.
EditText – To enter the second number.
Button – To perform addition.
EditText – To display the result.
4.Open MainActivity.java.
5.Initialize the EditText fields and ADD button using findViewById().
6.Get the two input values using getText().toString().
7.Convert the input strings into numeric values.
8.Perform addition when the user clicks the ADD button.
9.Display the sum in the result text box using setText().
10.Run the application on an Android emulator or mobile device.


## Program:
## Activity.xml
```

<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="20dp">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Addition of Two Numbers"
        android:textSize="24sp"
        android:textStyle="bold" />

    <EditText
        android:id="@+id/num1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter First Number"
        android:inputType="numberDecimal|numberSigned" />

    <EditText
        android:id="@+id/num2"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Enter Second Number"
        android:inputType="numberDecimal|numberSigned"/>

    <Button
        android:id="@+id/add"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ADD"/>

    <EditText
        android:id="@+id/result"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Result"
        android:focusable="false"
        android:inputType="none"/>

</LinearLayout>

```

## MainActivity.java
```
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

```

## Output:

<img width="1920" height="1080" alt="Screenshot (84)" src="https://github.com/user-attachments/assets/6aa940bc-102a-48e3-a003-c59a458cbc43" />

## Result: 
Thus the addition of two numbers in android studio is implemented.
