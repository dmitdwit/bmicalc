package example.binus.bmicalculator;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //declare variable
    EditText etWeight,etHeight;
    Button btnCalculate;
    static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etWeight = (EditText) findViewById(R.id.etWeight);
        etHeight = (EditText) findViewById(R.id.etHeight);
        btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String strWeight = etWeight.getText().toString();
        String strHeight = etHeight.getText().toString();

        float weight =  Float.parseFloat(strWeight);
        float height =  Float.parseFloat(strHeight)/100;

        float bmi = weight / (height*height);
        String result = "";
        if(bmi < 19){
            result = "Your BMI is Less Than Ideal";
            Log.v(TAG,"kurus");
        }else if(bmi > 24){
            result = "Your BMI is More Than Ideal";
            Log.v(TAG,"obesitas");
        }else{
            result = "Your BMI is Ideal";
            Log.v(TAG,"normal");
        }

        Toast.makeText(this,result,Toast.LENGTH_LONG).show();
        // pindah halaman
        Intent niat = new Intent(this, ResultActivity.class);
        niat.putExtra("berat" , weight);
        niat.putExtra("tinggi" , height);
        niat.putExtra("bmi", bmi);
        startActivity(niat);
    }
}
