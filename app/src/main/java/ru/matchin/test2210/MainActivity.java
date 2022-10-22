package ru.matchin.test2210;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    EditText editText;
    int counter = 0;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Нахождение элемента интерфейса в разметке по айди
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextView);

        // анонимный внутренний класс
        button.setOnClickListener(new View.OnClickListener() {
            // этот метод вызывается каждый раз при нажатии на кнопку
            @Override
            public void onClick(View view) {
                counter++;
                textView.setText(String.valueOf(counter));
                name = String.valueOf(editText.getText());
                Toast.makeText(
                        MainActivity.this,
                        "меня нажал " + name,
                        Toast.LENGTH_SHORT)
                    .show();
            }
        });
    }
}