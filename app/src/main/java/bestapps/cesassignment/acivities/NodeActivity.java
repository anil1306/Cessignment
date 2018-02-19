package bestapps.cesassignment.acivities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.LinkedList;

import bestapps.cesassignment.R;

public class NodeActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText etNumberOne, etNumberTwo, etNumberThree;
    private TextView tvHashOne, tvHashTwo, tvHashThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.node_activity);
        etNumberOne = (EditText) findViewById(R.id.et_num1);
        etNumberTwo = (EditText) findViewById(R.id.et_num2);
        etNumberThree = (EditText) findViewById(R.id.et_num3);
        tvHashOne = (TextView) findViewById(R.id.tv_hash1);
        tvHashTwo = (TextView) findViewById(R.id.tv_hash2);
        tvHashThree = (TextView) findViewById(R.id.tv_hash3);
        Button btnGetHash = (Button) findViewById(R.id.btn_hash_calc);
        btnGetHash.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.btn_hash_calc:
                LinkedList<String> linkedList = new LinkedList<>();
                linkedList.add(etNumberOne.getText().toString());
                linkedList.add(etNumberTwo.getText().toString());
                linkedList.add(etNumberThree.getText().toString());
                String[] array = linkedList.toArray(new String[linkedList.size()]);
                Log.d("HASH", "onClick: " + array[0].hashCode() + " " + array[1].hashCode() + " " + array[2].hashCode());
                tvHashOne.setText(String.valueOf(array[0].hashCode()));
                tvHashTwo.setText(String.valueOf(array[1].hashCode()));
                tvHashThree.setText(String.valueOf(array[2].hashCode()));
                break;
        }
    }

}
