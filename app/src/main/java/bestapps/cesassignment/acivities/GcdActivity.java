package bestapps.cesassignment.acivities;
//anil Doonga
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import bestapps.cesassignment.R;
import bestapps.cesassignment.utility.AlertUtil;
import bestapps.cesassignment.utility.Utility;

public class GcdActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etNumberOne,etNumberTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gcd_activity);
        etNumberOne=(EditText)findViewById(R.id.et_num1);
        etNumberTwo=(EditText)findViewById(R.id.et_num2);
        Button btnCalGCD = (Button) findViewById(R.id.btn_gcd_calc);
        Button btnNextScreen = (Button) findViewById(R.id.btn_next_activity);
        btnCalGCD.setOnClickListener(this);
        btnNextScreen.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_gcd_calc:
                if(etNumberOne.getText().toString().length()==0 || etNumberTwo.getText().toString().length()==0) {
                    Toast.makeText(this, R.string.null_string_toast, Toast.LENGTH_SHORT).show();
                }else{
                    int mGcdVal = Utility.mCalculateGCD(Integer.parseInt(etNumberOne.getText().toString()), Integer.parseInt(etNumberTwo.getText().toString()));
                    AlertUtil.alert_Msg(this, getString(R.string.gcd_val)+" "+mGcdVal);
                }
                break;
            case R.id.btn_next_activity:
                Intent myIntent = new Intent(GcdActivity.this, NodeActivity.class);
                startActivity(myIntent);
                break;
        }
    }

}
