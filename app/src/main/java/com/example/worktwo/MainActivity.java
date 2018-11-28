package com.example.worktwo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        btnt = (Button) findViewById(R.id.btnt);
        txt = (TextView) findViewById(R.id.txt);
    }

    Button btn;
    Button btnt;
    TextView txt;

    int r;
    public void oneclick(View view) {
        Random rd= new Random();
        r=rd.nextInt();
        txt.setText("Number=" +r);
    }

    public void twoclick(View view) {
        txt.setText("Number not found");
    }
}
