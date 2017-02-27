package com.example.towns.caclulator_townsend;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Double savedVal = 0.0;
    private Double currentVal = 0.0;

    private boolean isInput = false;
    private boolean calcDone = false;

    private String inputStr= "";
    private String operationStr="";
    private String savedStr= "";
    private String calcStr= "";

    private TextView ioTextView;
    private TextView prevAnsTextView;

    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button zeroButton;
    private Button decimalButton;

    private Button addButton;
    private Button subtractButton;
    private Button multButton;
    private Button divideButton;
    private Button clearAllButton;
    private Button clearLastButton;
    private Button equalsButton;
    private Button plusMinusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ioTextView = (TextView) findViewById(R.id.I_OTextView);
        prevAnsTextView = (TextView) findViewById(R.id.prevAnsTextView);

        oneButton = (Button) findViewById(R.id.oneButton);
        twoButton = (Button) findViewById(R.id.twoButton);
        threeButton = (Button) findViewById(R.id.threeButton);
        fourButton = (Button) findViewById(R.id.fourButton);
        fiveButton = (Button) findViewById(R.id.fiveButton);
        sixButton = (Button) findViewById(R.id.sixButton);
        sevenButton = (Button) findViewById(R.id.sevenButton);
        eightButton = (Button) findViewById(R.id.eightButton);
        nineButton = (Button) findViewById(R.id.nineButton);
        zeroButton = (Button) findViewById(R.id.zeroButton);
        decimalButton = (Button) findViewById(R.id.decimalButton);

        addButton = (Button) findViewById(R.id.addButton);
        subtractButton = (Button) findViewById(R.id.subtractButton);
        multButton = (Button) findViewById(R.id.multButton);
        divideButton = (Button) findViewById(R.id.divideButton);
        clearAllButton = (Button) findViewById(R.id.clearAllButton);
        clearLastButton = (Button) findViewById(R.id.clearLastButton);
        equalsButton = (Button) findViewById(R.id.equalsButton);
        plusMinusButton = (Button) findViewById(R.id.plusMinusButton);

        if (!isInput)
            ioTextView.setText(savedVal.toString());
        else
            ioTextView.setText(savedStr+operationStr+inputStr);


        oneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('1');
            }
        });
        twoButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('2');
            }
        });
        threeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('3');
            }
        });
        fourButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('4');
            }
        });
        fiveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('5');
            }
        });
        sixButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('6');
            }
        });
        sevenButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('7');
            }
        });
        eightButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('8');
            }
        });
        nineButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('9');
            }
        });
        zeroButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('0');
            }
        });
        decimalButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                appendToNum('.');
            }
        });
        clearAllButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputStr = "";
                savedStr = "";
                operationStr = "";
                calcStr = "";
                savedVal = 0.0;
                currentVal = 0.0;
                ioTextView.setText(savedVal.toString());
            }
        });
        clearLastButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                inputStr = "";
                ioTextView.setText(savedStr+operationStr+inputStr);
            }
        });
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOperand('+');
            }
        });
        subtractButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOperand('-');
            }
        });
        multButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOperand('*');
            }
        });
        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOperand('/');
            }
        });
        equalsButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                addOperand('=');
            }
        });

    }
    //takes a char and changes the string that we take values from.
    //only allows one decimal point to be added, if more tha one is
    //attempted there will be no change to the string.
    public void appendToNum(char input){
        if(!isInput){
            isInput = true;
        }
        if(input == '.' && !inputStr.contains(".")){
            inputStr = inputStr + ".";
        }
        else if(input =='1'){
            inputStr = inputStr + "1";
        }
        else if(input =='2'){
            inputStr = inputStr + "2";
        }
        else if(input =='3'){
            inputStr = inputStr + "3";
        }
        else if(input =='4'){
            inputStr = inputStr + "4";
        }
        else if(input =='5'){
            inputStr = inputStr + "5";
        }
        else if(input =='6'){
            inputStr = inputStr + "6";
        }
        else if(input =='7'){
            inputStr = inputStr + "7";
        }
        else if(input =='8'){
            inputStr = inputStr + "8";
        }
        else if(input =='9'){
            inputStr = inputStr + "9";
        }
        else if(input =='0'){
            inputStr = inputStr + "0";
        }
        ioTextView.setText(savedStr+operationStr+inputStr);
    }

    public void addOperand(char input){
        if(isInput) {
            if(!operationStr.isEmpty()){
                performCalc();
                calcDone = true;
            }
            if(input == '+'){
                operationStr = "+";
            }
            else if(input =='-'){
                operationStr = "-";
            }
            else if(input =='*'){
                operationStr = "*";
            }
            else if(input =='/') {
                operationStr = "/";
            }
            else if(input =='='){
                //just runs the perform calc
            }
            if(!calcDone) {
                savedStr = inputStr;
                inputStr = "";
                ioTextView.setText(savedStr + operationStr + inputStr);

            }
            if(calcDone) {
                prevAnsTextView.setText(calcStr);
                inputStr = "";
            }
            isInput = false;
            calcDone = false;
        }

    }

    public void performCalc(){
        //if(!savedStr.isEmpty())
        savedVal = Double.valueOf(savedStr);
        //else
        //savedVal = Double.valueOf(calcStr);
        currentVal = Double.valueOf(inputStr);
        if(operationStr.contains("+"))
            savedVal = savedVal + currentVal;
        else if(operationStr.contains("-"))
            savedVal = savedVal - currentVal;
        else if(operationStr.contains("*"))
            savedVal = savedVal * currentVal;
        else if(operationStr.contains("/"))
            savedVal = savedVal / currentVal;
        savedStr = "";
        operationStr = "";
        inputStr = "";
        calcStr = savedVal.toString();
        savedVal = 0.0;
        currentVal = 0.0;
    }

}
