package demoradiobutton.android.myapplicationdev.com.demoradiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get radiogroup object
                RadioGroup rg = (RadioGroup) findViewById(R.id.radiogroup1);
                //get id of selected radio button within radiogroup
                int selectedbtnid = rg.getCheckedRadioButtonId();
                //get radio button object from id gotten above
                RadioButton rb = (RadioButton) findViewById(selectedbtnid);
                //show toast message
                Toast.makeText(getBaseContext(), rb.getText(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
