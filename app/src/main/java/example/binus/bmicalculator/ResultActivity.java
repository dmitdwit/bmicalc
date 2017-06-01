package example.binus.bmicalculator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    float weightResult, heightResult,bmiResult;
    TextView tvWeightResult , tvHeightResult, tvBMIResult;
    Button btnSeeActLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        weightResult = getIntent().getFloatExtra("berat",0);
        heightResult = getIntent().getFloatExtra("tinggi",0);
        bmiResult = getIntent().getFloatExtra("bmi",0);

        tvWeightResult = (TextView) findViewById(R.id.tvWeightResult);
        tvWeightResult.setText("Weight : "+ weightResult + "Kg");
        tvHeightResult = (TextView) findViewById(R.id.tvHeightResult);
        tvHeightResult.setText("Height : "+ heightResult + "Cm");
        tvBMIResult = (TextView) findViewById(R.id.tvBMIResult);
        tvBMIResult.setText("BMI : "+ bmiResult);


        final Context mCtx = this;
        btnSeeActLifecycle = (Button) findViewById(R.id.btnSeeActLifecycle);
        btnSeeActLifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent niatLifecycle = new Intent(mCtx,LifecycleActivity.class);
                startActivity(niatLifecycle);
            }
        });
    }
}
