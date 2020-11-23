package com.example.dynamicradiobuttondemo;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg;
    private RelativeLayout rl;
    private RadioButton rb1;
    private RadioButton rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = new RadioGroup(this);
        rl = (RelativeLayout) findViewById(R.id.relativeLayout);
        rb1 = new RadioButton(this);
        rb2 = new RadioButton(this);

        rb1.setText("male");
        rb2.setText("female");
        rg.addView(rb1);
        rg.addView(rb2);
        rg.setOrientation(RadioGroup.HORIZONTAL);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int)
                RelativeLayout.LayoutParams.WRAP_CONTENT, (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        params.leftMargin = 150;
        params.topMargin = 150;

        rg.setLayoutParams(params);
        rl.addView(rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) findViewById(checkedId);
                Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}