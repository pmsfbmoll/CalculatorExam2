package com.example.calculatorexam2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button but0;
    private Button but1;
    private Button but2;
    private Button but3;
    private Button but4;
    private Button but5;
    private Button but6;
    private Button but7;
    private Button but8;
    private Button but9;
    private Button but_plus;
    private Button but_minus;
    private Button but_x;
    private Button but_div;
    private Button but_dot;
    private Button but_c;
    protected double memory=0;
    protected double num=0;
    protected double result=0;
    protected byte operand=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tv=(TextView) findViewById(R.id.text);
        this.but0=(Button) findViewById(R.id.button0);
        this.but1=(Button) findViewById(R.id.button1);
        this.but2=(Button) findViewById(R.id.button2);
        this.but3=(Button) findViewById(R.id.button3);
        this.but4=(Button) findViewById(R.id.button4);
        this.but5=(Button) findViewById(R.id.button5);
        this.but6=(Button) findViewById(R.id.button6);
        this.but7=(Button) findViewById(R.id.button7);
        this.but8=(Button) findViewById(R.id.button8);
        this.but9=(Button) findViewById(R.id.button9);
        this.but_plus=(Button) findViewById(R.id.button_plus);
        this.but_minus=(Button) findViewById(R.id.button_minus);
        this.but_x=(Button) findViewById(R.id.button_x);
        this.but_div=(Button) findViewById(R.id.button_div);
        this.but_dot=(Button) findViewById(R.id.button_dot);
        this.but_c=(Button) findViewById(R.id.buttonC);
    }

    public void setNumber(boolean reset, double n){
        if (reset) {
            tv.setText(Double.toString(0));
        }else{
            tv.setText(tv.getText()+Integer.toString((int)num));
        }
    }

    public void setNum(){
        num= Double.parseDouble((String) tv.getText());
    }

    public void showResult(){
        tv.setText(Double.toString(result));
    }

    public void clear(){
        this.result=0;
        this.num=0;
        this.memory=0;
        this.operand=0;
        tv.setText("0");
    }

    public void add0(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"0");
        setNum();
    }
    public void add1(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"1");
        setNum();
    }
    public void add2(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"2");
        setNum();
    }
    public void add3(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"3");
        setNum();
    }
    public void add4(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"4");
        setNum();
    }
    public void add5(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"5");
        setNum();
    }
    public void add6(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"6");
        setNum();
    }
    public void add7(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"7");
        setNum();
    }
    public void add8(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"8");
        setNum();
    }
    public void add9(View view){
        if (operand==0){
            tv.setText("");
        }
        tv.setText(tv.getText()+"9");
        setNum();
    }
    public void addDot(View view){
        if (tv.getText().equals("")){
            tv.setText("0");
        }
        tv.setText(tv.getText()+".");
    }
    public void addSum(View view){
        this.operand=1;
        this.memory=num;
        this.tv.setText("0");
    }
    public void addSub(View view){
        this.operand=2;
        this.memory=num;
        this.tv.setText("0");
    }
    public void addMul(View view){
        this.operand=3;
        this.memory=num;
        this.tv.setText("0");
    }
    public void addDiv(View view){
        this.operand=4;
        this.memory=num;
        this.tv.setText("0");
    }
    public void operate(View view){
        switch (operand){
            case 0:
                Log.d("patata","No operation was selected");
                break;

            case 1:
                result=memory+num;
                break;

            case 2:
                result=memory-num;
                break;

            case 3:
                result=memory*num;
                break;

            case 4:
                result=memory/num;
                break;

            default:
                Log.d("patata", "An error ocurred, operation number:"+operand);
        }
        operand=0;
        num=result;
        tv.setText(Double.toString(result));
        result=0;
    }

    public void onClickClear(View view){
        this.clear();
    }

}
