package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button showButton;
    private CheckBox suagrCheckBox,milkCheckBox,waterCheckBox;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suagrCheckBox = findViewById(R.id.checkboxSuagr_Id);
        milkCheckBox = findViewById(R.id.checkboxMilk_Id);
        waterCheckBox = findViewById(R.id.checkboxWater_Id);

        showButton = findViewById(R.id.showButton_Id);

        resultTextView = findViewById(R.id.resultTextView_Id);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (milkCheckBox.isChecked()){
                    String value = milkCheckBox.getText().toString();
                    stringBuilder.append(value + "is Ordered \n");
                }
                if (suagrCheckBox.isChecked()){
                    String value = suagrCheckBox.getText().toString();
                    stringBuilder.append(value + "is Ordered "+"\n");
                }
                if (waterCheckBox.isChecked()){
                    String value = waterCheckBox.getText().toString();
                    stringBuilder.append(value + "is Ordered ");
                }

                resultTextView.setText(stringBuilder);


            }
        });

    }
}