package com.example.calculator;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
ChipGroup chipGroup;
    //Button zero,one,two,three,four,five,six,seven,eight,nine,double0,div,mul,add,sub,dot,result,empty,cut,per;
    TextView inputText,outputText;
    ConstraintLayout rootLayout;
    String data;
    Chip btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,double_zero,divide,multiply,plus,minus,decimal,equals,clear,back,forward;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        ConstraintLayout rootLayout = findViewById(R.id.rootLayout);
        rootLayout.setBackgroundResource(R.drawable.background);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        double_zero=findViewById(R.id.double_zero);
        divide=findViewById(R.id.divide);
        multiply=findViewById(R.id.multiply);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        decimal=findViewById(R.id.decimal);
        equals=findViewById(R.id.equals);
        forward=findViewById(R.id.forward);
        clear=findViewById(R.id.clear);
        inputText=findViewById(R.id.inputText);
        outputText=findViewById(R.id.outputText);
        back=findViewById(R.id.back);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"0");
                data=data+"0";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"1");
                data=data+"1";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"2");
                data=data+"2";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"3");
                data=data+"3";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"4");
                data=data+"4";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"5");
                data=data+"5";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"6");
                data=data+"6";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"7");
                data=data+"7";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"8");
                data=data+"8";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"9");
                data=data+"9";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        double_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();
                inputText.setText(data+"00");
                data=data+"00";
                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    outputText.setText("Error!");
                    inputText.setText("");
                }
            }
        });
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    data=inputText.getText().toString();
                    if(data.charAt(data.length()-1)!='.' && data.charAt(data.length()-1)!='+' && data.charAt(data.length()-1)!='-' && data.charAt(data.length()-1)!='x' && data.charAt(data.length()-1)!='÷')
                    {
                        data=data+".";
                        inputText.setText(data);
                    }
                }
               catch(Exception e){
                    //do nothing
               }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    data=inputText.getText().toString();
                    if(data.charAt(data.length()-1)!='.' && data.charAt(data.length()-1)!='+' && data.charAt(data.length()-1)!='-' && data.charAt(data.length()-1)!='x' && data.charAt(data.length()-1)!='÷')
                    {
                        data=data+"÷";
                        inputText.setText(data);
                    }
                }
                catch(Exception e){
                    //do nothing
                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    data=inputText.getText().toString();
                    if(data.charAt(data.length()-1)!='.' && data.charAt(data.length()-1)!='+' && data.charAt(data.length()-1)!='-' && data.charAt(data.length()-1)!='x' && data.charAt(data.length()-1)!='÷')
                    {
                        data=data+"x";
                        inputText.setText(data);
                    }
                }
                catch(Exception e){
                    //do nothing
                }
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    data=inputText.getText().toString();
                    if(data.charAt(data.length()-1)!='.' && data.charAt(data.length()-1)!='+' && data.charAt(data.length()-1)!='-' && data.charAt(data.length()-1)!='x' && data.charAt(data.length()-1)!='÷')
                    {
                        data=data+"+";
                        inputText.setText(data);
                    }
                }
                catch(Exception e){
                    //do nothing
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    data=inputText.getText().toString();
                    if(data.charAt(data.length()-1)!='.' && data.charAt(data.length()-1)!='+' && data.charAt(data.length()-1)!='-' && data.charAt(data.length()-1)!='x' && data.charAt(data.length()-1)!='÷')
                    {
                        data=data+"-";
                        inputText.setText(data);
                    }
                }
                catch(Exception e){
                    //do nothing
                }
            }
        });
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    data = outputText.getText().toString();
                    inputText.setText(data);
                }
                catch(Exception e){
                    //dp nothing
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputText.setText("");
                outputText.setText("");
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=inputText.getText().toString();

                data=data.replaceAll("÷","/");
                data=data.replaceAll("x","*");
                data=data.replaceAll("%","/100");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult ="";
                Scriptable scriptable=rhino.initSafeStandardObjects();
                try{
                    finalResult=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
                    if(finalResult.charAt(finalResult.length()-1)=='0' && finalResult.charAt(finalResult.length()-2)=='.')
                    {
                        finalResult=finalResult.substring(0,finalResult.length()-2);
                        outputText.setText(finalResult);
                        inputText.setText(finalResult);
                    }
                    else
                    {
                        outputText.setText(finalResult);
                        inputText.setText(finalResult);
                    }

                }
                catch(Exception e){
                    String temp = outputText.getText().toString();
                    inputText.setText(temp);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = inputText.getText().toString();
                if(data.length()>0) {
                    data = data.substring(0, data.length() - 1);
                }
                inputText.setText(data);
                try {

                    if (data.charAt(data.length() - 1) != '.' && data.charAt(data.length() - 1) != '+' && data.charAt(data.length() - 1) != '-' && data.charAt(data.length() - 1) != 'x' && data.charAt(data.length() - 1) != '÷' && data!=null && data.length()>0) {
                        try {

                            data = data.replaceAll("÷", "/");
                            data = data.replaceAll("x", "*");
                            data = data.replaceAll("%", "/100");

                            Context rhino = Context.enter();
                            rhino.setOptimizationLevel(-1);

                            String finalResult = "";
                            Scriptable scriptable = rhino.initSafeStandardObjects();
                            try {
                                finalResult = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();
                                if (finalResult.charAt(finalResult.length() - 1) == '0' && finalResult.charAt(finalResult.length() - 2) == '.') {
                                    finalResult = finalResult.substring(0, finalResult.length() - 2);
                                    outputText.setText(finalResult);
                                } else {
                                    outputText.setText(finalResult);
                                }

                            } catch (Exception e) {
                                outputText.setText("");
                                inputText.setText("");
                            }
                        }
                        catch (Exception e){
                            inputText.setText("");
                            outputText.setText("");
                        }


//                try{
//                    data=inputText.getText().toString();
//                    data=data.substring(0,data.length()-1);
//                    inputText.setText(data);
//                }
//                catch(Exception e){
//                    inputText.setText("");
//                }

                    }
                }
                catch (Exception e){
                    inputText.setText("");
                    outputText.setText("");
                }
            }
        });
    }
}