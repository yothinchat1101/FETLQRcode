package fetl.chatveeratham.yothin.fetlqrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText nameEditText, userEditText, passwordEditText;
    private ImageView imageView;
    private Button button;
    private String nameString, userString, passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Initial View
        initialView();
    }// main method

    @Override
    public void onBackPressed() {
        //super.onBackPressed(); //เป็นการปิด back bar
    }

    private void initialView() {
        nameEditText = (EditText) findViewById(R.id.edtName);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        imageView = (ImageView) findViewById(R.id.btnBack);
        button = (Button) findViewById(R.id.btnNewRegister);

        //controller
        controller();
    }

    private void controller() {
        imageView.setOnClickListener(RegisterActivity.this);
        button.setOnClickListener(RegisterActivity.this);
    }

    @Override
    public void onClick(View v) {
        //For Back
        if (v == imageView) {
            finish();
        }

        //For Button
        if (v == button) {
            //Get value from EditText
            nameString = nameEditText.getText().toString().trim();
            userString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();

            //Check space
            if (nameString.equals("") || userString.equals("") || passwordString.equals("")) {
                //Have Space
                MyAlert myAlert = new MyAlert(RegisterActivity.this);
                myAlert.myDialog(getResources().getString(R.string.title_HaveSpace),
                        getResources().getString(R.string.message_HaveSpace));

            } else {
                //No Space
            }
        }
    }
}
