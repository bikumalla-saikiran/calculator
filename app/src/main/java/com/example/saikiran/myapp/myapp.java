package com.example.saikiran.myapp;

import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class myapp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myapp);
    }
    public void OnButtonClick(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText);
        int value1=0,value2;
        boolean b1=false,b2=false,b3=false,b4=false;
        switch(v.getId())
        {
            case R.id.button0 : e1.setText(e1.getText()+"0");
                                break;
            case R.id.button1 : e1.setText(e1.getText()+"1");
                                break;
            case R.id.button2 : e1.setText(e1.getText()+"2");
                                break;
            case R.id.button3 : e1.setText(e1.getText()+"3");
                                break;
            case R.id.button4 : e1.setText(e1.getText()+"4");
                                break;
            case R.id.button5 : e1.setText(e1.getText()+"5");
                                break;
            case R.id.button6 : e1.setText(e1.getText()+"6");
                                break;
            case R.id.button7 : e1.setText(e1.getText()+"7");
                                break;
            case R.id.button8 : e1.setText(e1.getText()+"8");
                                break;
            case R.id.button9 : e1.setText(e1.getText()+"9");
                                break;
            case R.id.buttonp : if(e1==null)
                                e1.setText("");
                                else
                                    { value1=Integer.parseInt(e1.getText()+"");
                                      b1=true;
                                      e1.setText(null);}
                                break;
            case R.id.buttonm : value1=Integer.parseInt(e1.getText()+"");
                                b2=true;
                                e1.setText(null);
                                break;
            case R.id.buttons : value1=Integer.parseInt(e1.getText()+"");
                                b3=true;
                                e1.setText(null);
                                break;
            case R.id.buttondiv : value1=Integer.parseInt(e1.getText()+"");
                                  b4=true;
                                  e1.setText(null);
                                  break;
            case R.id.buttone : value2=Integer.parseInt(e1.getText()+"");
                                if(b1==true)
                                { e1.setText(value1+value2+"");
                                 b1=false; }
                                if(b3==true)
                                { e1.setText(value1-value2+"");
                                  b3=false; }
                                if(b2==true)
                                { e1.setText(value1*value2+"");
                                  b2=false; }
                                if(b4==true)
                                { e1.setText(value1/value2+"");
                                  b4=false; }
                                  break;
            case R.id.buttonc : e1.setText("");

        }
    }
}




