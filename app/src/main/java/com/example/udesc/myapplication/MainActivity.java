package com.example.udesc.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Integer quant = 0;
    private EditText itensView;
    private TextView quantView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.itensView = findViewById(R.id.itensView);
        this.quantView = findViewById(R.id.quantView);
    }

    public void add(View view) {
        this.quant = this.quant + Integer.parseInt(itensView.getText().toString());
        itensView.setText("");
        this.updateQuantView();
    }

    public void remove(View view) {
        this.quant = this.quant - Integer.parseInt(itensView.getText().toString());
        itensView.setText("");
        this.updateQuantView();
    }

    public void updateQuantView() {
        this.quantView.setText("Quantidade = " + this.quant);
    }
}
