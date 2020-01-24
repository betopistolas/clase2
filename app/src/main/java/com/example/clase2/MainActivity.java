package com.example.clase2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtResult;
    private Button btnClear,btnDel;

    int txtTecleado=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResult = (TextView) findViewById(R.id.txtResult);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnDel = (Button)findViewById(R.id.btnDel);
    }

    public void btnClearOnClick(View view){
        txtResult.setText("");
        return;
    }

    public void btnDelOnClick(View view){
        if(!txtResult.getText().equals("")){
            txtResult.setText(txtResult.getText().toString().substring(0,(txtResult.getText().length()-1)));
        }
        return;
    }
}
