package com.example.lfcal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity
{
    private TextView twoT;
    private TextView oneT;
    private TextView tfT;
    private TextView tcT;
    private TextView fcT;
    private TextView fdT;
    private TextView tdT;
    private TextView ttT;
    private TextView ftT;
    private TextView hundT;
    private TextView twosT;
    private TextView onesT;
    private TextView tfsT;
    private TextView tensT;
    private TextView fivesT;

    private Button twoPB;
    private Button onePB;
    private Button tfPB;
    private Button tcPB;
    private Button fcPB;
    private Button fdPB;
    private Button tdPB;
    private Button ttPB;
    private Button ftPB;
    private Button hundPB;
    private Button twosPB;
    private Button onesPB;
    private Button tfsPB;
    private Button tensPB;
    private Button fivesPB;

    private Button twoMB;
    private Button oneMB;
    private Button tfMB;
    private Button tcMB;
    private Button fcMB;
    private Button fdMB;
    private Button tdMB;
    private Button ttMB;
    private Button ftMB;
    private Button hundMB;
    private Button twosMB;
    private Button onesMB;
    private Button tfsMB;
    private Button tensMB;
    private Button fivesMB;

    private EditText twoET;
    private EditText oneET;
    private EditText tfET;
    private EditText tcET;
    private EditText fcET;
    private EditText fdET;
    private EditText tdET;
    private EditText ttET;
    private EditText ftET;
    private EditText hundET;
    private EditText twosET;
    private EditText onesET;
    private EditText tfsET;
    private EditText tensET;
    private EditText fivesET;

    private TextView total;
    private TextView takeout;

    double two;
    double one;
    double tf;
    double tc;
    double fc;
    double fd;
    double td;
    double tt;
    double ft;
    double hund;
    double twos;
    double ones;
    double tfs;
    double tens;
    double fives;

    double sum;
    double left;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inital();
        setPlushListener();
        setEditTextListener();
        setMinusListener();

    }


    //---------------------------------------------------------------------------


    private void inital()
    {
        twoT = findViewById(R.id.twoTV);
        oneT = findViewById(R.id.oneTV);
        tfT = findViewById(R.id.tfTV);
        tcT = findViewById(R.id.tcTV);
        fcT = findViewById(R.id.fcTV);
        fdT = findViewById(R.id.fdTV);
        tdT = findViewById(R.id.tdTV);
        ttT = findViewById(R.id.twdTV);
        ftT = findViewById(R.id.ftdTV);
        hundT = findViewById(R.id.hundTV);
        twosT = findViewById(R.id.twosTV);
        onesT = findViewById(R.id.onesTV);
        tfsT = findViewById(R.id.tfsTV);
        tensT = findViewById(R.id.tcsTV);
        fivesT = findViewById(R.id.fcsTV);

        twoPB = findViewById(R.id.twoBP);
        onePB = findViewById(R.id.oneBP);
        tfPB = findViewById(R.id.tfBP);
        tcPB = findViewById(R.id.tcBP);
        fcPB = findViewById(R.id.fcBP);
        fdPB = findViewById(R.id.fdBP);
        tdPB = findViewById(R.id.tdBP);
        ttPB = findViewById(R.id.twdBP);
        ftPB = findViewById(R.id.ftdBP);
        hundPB = findViewById(R.id.hundBP);
        twosPB = findViewById(R.id.twosBP);
        onesPB = findViewById(R.id.onesBP);
        tfsPB = findViewById(R.id.tfsBP);
        tensPB = findViewById(R.id.tcsBP);
        fivesPB = findViewById(R.id.fcsBP);

        twoMB = findViewById(R.id.twoBM);
        oneMB = findViewById(R.id.oneBM);
        tfMB = findViewById(R.id.tfBM);
        tcMB = findViewById(R.id.tcBM);
        fcMB = findViewById(R.id.fcBM);
        fdMB = findViewById(R.id.fdBM);
        tdMB = findViewById(R.id.tdBM);
        ttMB = findViewById(R.id.twdBM);
        ftMB = findViewById(R.id.ftdBM);
        hundMB = findViewById(R.id.hundBM);
        twosMB = findViewById(R.id.twosBM);
        onesMB = findViewById(R.id.onesBM);
        tfsMB = findViewById(R.id.tfsBM);
        tensMB = findViewById(R.id.tcsBM);
        fivesMB = findViewById(R.id.fcsBM);

        twoET = findViewById(R.id.twoE);
        oneET = findViewById(R.id.oneE);
        tfET = findViewById(R.id.tfE);
        tcET = findViewById(R.id.tcE);
        fcET = findViewById(R.id.fcE);
        fdET = findViewById(R.id.fdE);
        tdET = findViewById(R.id.tdE);
        ttET = findViewById(R.id.twdE);
        ftET = findViewById(R.id.ftdE);
        hundET = findViewById(R.id.hundE);
        twosET = findViewById(R.id.twosE);
        onesET = findViewById(R.id.onesE);
        tfsET = findViewById(R.id.tfsE);
        tensET = findViewById(R.id.tcsE);
        fivesET = findViewById(R.id.fcsE);

        total = findViewById(R.id.total);
        takeout = findViewById(R.id.takeout);
    }


    //--------------------------------------------------------------------

    private void setPlushListener()
    {
        twoPB.setOnClickListener(new PlushButtonListener());
        onePB.setOnClickListener(new PlushButtonListener());
        tfPB.setOnClickListener(new PlushButtonListener());
        tcPB.setOnClickListener(new PlushButtonListener());
        fcPB.setOnClickListener(new PlushButtonListener());
        fdPB.setOnClickListener(new PlushButtonListener());
        tdPB.setOnClickListener(new PlushButtonListener());
        ttPB.setOnClickListener(new PlushButtonListener());
        ftPB.setOnClickListener(new PlushButtonListener());
        hundPB.setOnClickListener(new PlushButtonListener());
        twosPB.setOnClickListener(new PlushButtonListener());
        onesPB.setOnClickListener(new PlushButtonListener());
        tfsPB.setOnClickListener(new PlushButtonListener());
        tensPB.setOnClickListener(new PlushButtonListener());
        fivesPB.setOnClickListener(new PlushButtonListener());
    }


    private void setMinusListener()
    {
        twoMB.setOnClickListener(new MinusButtonListener());
        oneMB.setOnClickListener(new MinusButtonListener());
        tfMB.setOnClickListener(new MinusButtonListener());
        tcMB.setOnClickListener(new MinusButtonListener());
        fcMB.setOnClickListener(new MinusButtonListener());
        fdMB.setOnClickListener(new MinusButtonListener());
        tdMB.setOnClickListener(new MinusButtonListener());
        ttMB.setOnClickListener(new MinusButtonListener());
        ftMB.setOnClickListener(new MinusButtonListener());
        hundMB.setOnClickListener(new MinusButtonListener());
        twosMB.setOnClickListener(new MinusButtonListener());
        onesMB.setOnClickListener(new MinusButtonListener());
        tfsMB.setOnClickListener(new MinusButtonListener());
        tensMB.setOnClickListener(new MinusButtonListener());
        fivesMB.setOnClickListener(new MinusButtonListener());
    }

    private void setEditTextListener()
    {
        twoET.addTextChangedListener(new EditTextListener("two"));
        oneET.addTextChangedListener(new EditTextListener("one"));
        tfET.addTextChangedListener(new EditTextListener("tf"));
        tcET.addTextChangedListener(new EditTextListener("tc"));
        fcET.addTextChangedListener(new EditTextListener("fc"));
        fdET.addTextChangedListener(new EditTextListener("fd"));
        tdET.addTextChangedListener(new EditTextListener("td"));
        ttET.addTextChangedListener(new EditTextListener("tt"));
        ftET.addTextChangedListener(new EditTextListener("ft"));
        hundET.addTextChangedListener(new EditTextListener("hund"));
        twosET.addTextChangedListener(new EditTextListener("twos"));
        onesET.addTextChangedListener(new EditTextListener("ones"));
        tfsET.addTextChangedListener(new EditTextListener("tfs"));
        tensET.addTextChangedListener(new EditTextListener("tens"));
        fivesET.addTextChangedListener(new EditTextListener("fives"));
    }


    //---------------------------------------------------------------------

    public void calSum()
    {
        sum = two + one + twos + ones + tf + tfs + tc + tens + fc + fives;
        sum += td + tt + fd + ft + hund;
    }

    //-------------------------------------------------------------------

    public void calTakeout()
    {
        left = sum - 500;
        BigDecimal bd = new BigDecimal(left);
        left = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }





    /////////////////////////////////////////////////////////////////////////////////////

    private class PlushButtonListener implements View.OnClickListener
    {
        String number = null;

        public String checkEmpty(String number)
        {
            if(number == null || number.equals(""))
                return "0";
            else
                return number;

        }

        private void cal(EditText et)
        {
            double n;
            number = et.getText().toString();
            n = Double.parseDouble(checkEmpty(number));
            n++;
            et.setText("" + n);
        }

        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.twoBP :
                    two++;
                    cal(twoET);
                    break;
                case R.id.oneBP :
                    one++;
                    cal(oneET);
                    break;
                case R.id.tfBP :
                    tf++;
                    cal(tfET);
                    break;
                case R.id.tcBP :
                    tc++;
                    cal(tcET);
                    break;
                case R.id.fcBP :
                    fc++;
                    cal(fcET);
                    break;
                case R.id.fdBP :
                    fd++;
                    cal(fdET);
                    break;
                case R.id.tdBP :
                    td++;
                    cal(tdET);
                    break;
                case R.id.twdBP :
                    tt++;
                    cal(ttET);
                    break;
                case R.id.ftdBP :
                    ft++;
                    cal(ftET);
                    break;
                case R.id.hundBP :
                    hund++;
                    cal(hundET);
                    break;
                case R.id.twosBP :
                    twos++;
                    cal(twosET);
                    break;
                case R.id.onesBP :
                    ones++;
                    cal(onesET);
                    break;
                case R.id.tfsBP :
                    tfs++;
                    cal(tfsET);
                    break;
                case R.id.tcsBP :
                    tens++;
                    cal(tensET);
                    break;
                case R.id.fcsBP :
                    fives++;
                    cal(fivesET);
                    break;
            }

        }// end onClick
    }// end private class
    
    ///////////////////////////////////////////////////////////////////////////////////////

    
    private class MinusButtonListener implements View.OnClickListener
    {
        String number = null;

        public String checkEmpty(String number)
        {
            if(number == null || number.equals(""))
                return "0";
            else
                return number;

        }

        private void cal(EditText et)
        {
            double n;
            number = et.getText().toString();
            n = Double.parseDouble(checkEmpty(number));
            n--;
            et.setText("" + n);
        }
        
        public void onClick(View v)
        {
            switch(v.getId())
            {
                case R.id.twoBM :
                    two--;
                    cal(twoET);
                    break;
                case R.id.oneBM :
                    one--;
                    cal(oneET);
                    break;
                case R.id.tfBM :
                    tf--;
                    cal(tfET);
                    break;
                case R.id.tcBM :
                    tc--;
                    cal(tcET);
                    break;
                case R.id.fcBM :
                    fc--;
                    cal(fcET);
                    break;
                case R.id.fdBM :
                    fd--;
                    cal(fdET);
                    break;
                case R.id.tdBM :
                    td--;
                    cal(tdET);
                    break;
                case R.id.twdBM :
                    tt--;
                    cal(ttET);
                    break;
                case R.id.ftdBM :
                    ft--;
                    cal(ftET);
                    break;
                case R.id.hundBM :
                    hund--;
                    cal(hundET);
                    break;
                case R.id.twosBM :
                    twos--;
                    cal(twosET);
                    break;
                case R.id.onesBM :
                    ones--;
                    cal(onesET);
                    break;
                case R.id.tfsBM :
                    tfs--;
                    cal(tfsET);
                    break;
                case R.id.tcsBM :
                    tens--;
                    cal(tensET);
                    break;
                case R.id.fcsBM :
                    fives--;
                    cal(fivesET);
                    break;
            }
        }
    }
    
    
    


    ////////////////////////////////////////////////////////////////////////////////////////

    private class EditTextListener implements TextWatcher
    {
        String id = null;
        String number = null;



        public EditTextListener(String id)
        {
            this.id = id;
        }

        public String checkEmpty(String number)
        {
            if(number == null || number.equals(""))
                return "0";
            else
                return number;
        }

        private double cal(EditText et, TextView tv, double value)
        {
            double n;
            number = et.getText().toString();
            n = Double.parseDouble(checkEmpty(number));
            n *= value;
            BigDecimal bd = new BigDecimal(n);
            n = bd.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
            tv.setText("" + n);
            return n;
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
        {
            switch(id)
            {
                case "two":
                    two = cal(twoET, twoT, 2);
                    break;

                case "one":
                    one = cal(oneET, oneT, 1);
                    break;

                case "tf":
                    tf = cal(tfET, tfT, 0.25);
                    break;

                case "tc":
                    tc = cal(tcET, tcT, 0.1);
                    break;

                case "fc":
                    fc = cal(fcET, fcT, 0.05);
                    break;

                case "fd":
                    fd = cal(fdET, fdT, 5);
                    break;

                case "td":
                    td = cal(tdET, tdT, 10);
                    break;

                case "tt":
                    tt = cal(ttET, ttT, 20);
                    break;

                case "ft":
                    ft = cal(ftET, ftT, 50);
                    break;

                case "hund":
                    hund = cal(hundET, hundT, 100);
                    break;

                case "twos":
                    twos = cal(twosET, twosT, 50);
                    break;

                case "ones":
                    ones = cal(onesET, onesT, 25);
                    break;

                case "tfs":
                    tfs = cal(tfsET, tfsT, 10);
                    break;

                case "tens":
                    tens = cal(tensET, tensT, 5);
                    break;

                case "fives":
                    fives = cal(fivesET, fivesT, 2);
                    break;

            }
            calSum();
            calTakeout();
            total.setText("" + sum);
            takeout.setText("" + left);
        }



        @Override
        public void afterTextChanged(Editable editable)
        {

        }
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
        {

        }
    }

}
