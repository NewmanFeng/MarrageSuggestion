package com.example.charlesfeng.marragesuggestion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtnOk;
    private EditText mEdtAge;
    private EditText mEdtGender;
    private TextView mTxtSuggestion;

    private View.OnClickListener btnOkOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String gender = mEdtGender.getText().toString();
            int age = Integer.parseInt(mEdtAge.getText().toString());
            String suggestion = getString(R.string.Suggestion);

            if (gender.toUpperCase().equals(getString(R.string.Male))) {
                if (age < 28) {
                    suggestion += getString(R.string.Not_Hurry);
                } else if (age > 33) {
                    suggestion += getString(R.string.Should_Get_Marrage);
                } else {
                    suggestion += getString(R.string.Find_Couple);
                }
            }

            if (gender.toUpperCase().equals(getString(R.string.Female))) {
                if (age < 25) {
                    suggestion += getString(R.string.Not_Hurry);
                } else if (age > 30) {
                    suggestion += getString(R.string.Should_Get_Marrage);
                } else {
                    suggestion += getString(R.string.Find_Couple);
                }
            }
            mTxtSuggestion.setText(suggestion);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnOk = (Button) findViewById(R.id.btnOk);
        mBtnOk.setOnClickListener(btnOkOnClick);

        mEdtAge = (EditText) findViewById(R.id.edtAge);
        mEdtGender = (EditText) findViewById(R.id.edtGender);
        mTxtSuggestion = (TextView) findViewById(R.id.txtSuggestion);

    }
}
