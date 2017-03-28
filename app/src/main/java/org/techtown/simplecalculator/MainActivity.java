package org.techtown.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    EditText edit1;
    EditText edit2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1 = (EditText) findViewById(R.id.edit_first);
        edit2 = (EditText) findViewById(R.id.edit_second);
        Button but_plus = (Button) findViewById(R.id.but_plus);
        Button but_minus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        textResult = (TextView) findViewById(R.id.text_result);

        but_plus.setOnClickListener(butHandler);
        but_minus.setOnClickListener(butHandler);
        but_multiply.setOnClickListener(butHandler);
        but_division.setOnClickListener(butHandler);

        /*@Override
        public void onClick (View view){
            int num1=Integer.parseInt(edit1.getText().toString());
            int num2=Integer.parseInt(edit2.getText().toString());
            int result = 0;

            switch (view.getId()){
                case R.id.but_plus:
                    result = num1+num2;
                    break;
                case R.id.but_minus:
                    result = num1-num2;
                    break;
                case R.id.but_multiply:
                    result = num1*num2;
                    break;
                case R.id.but_division:
                    result = num1/num2;
                    break;
            }

        }
    }*/
    }//end oncreat

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int num1 = Integer.parseInt(edit1.getText().toString());
            int num2 = Integer.parseInt(edit2.getText().toString());
            int result = 0;

            switch (view.getId()) {
                case R.id.but_plus:
                    result = num1 + num2;
                    break;
                case R.id.but_minus:
                    result = num1 - num2;
                    break;
                case R.id.but_multiply:
                    result = num1 * num2;
                    break;
                case R.id.but_division:
                    result = num1 / num2;
                    break;
            }
            textResult.setText(result);
        }
    };

        /*but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = Integer.parseInt(edit1.getText().toString());
                int su2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(su+su2));
            }
        });
        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = Integer.parseInt(edit1.getText().toString());
                int su2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(su-su2));
            }
        });
        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = Integer.parseInt(edit1.getText().toString());
                int su2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(su*su2));
            }
        });
        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = Integer.parseInt(edit1.getText().toString());
                int su2 = Integer.parseInt(edit2.getText().toString());
                textResult.setText(Integer.toString(su/su2));
            }
        });*/
}