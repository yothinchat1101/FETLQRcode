package fetl.chatveeratham.yothin.fetlqrcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit การประกาศตัวแปร
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View การเชื่อมความสัมพันธ์ของตัวแปร
        initialView();

        //Controller
        controller();


    }// Main Method

    private void controller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);
    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtNewRegister);
        button = (Button) findViewById(R.id.btnLogin);

    }


    @Override
    public void onClick(View v) {

        //For TextView
        if (v == textView) {
            //Intent to Register
            Intent intent = new Intent(MainActivity.this,RegisterActivity.class);
            startActivity(intent);
        }

        //For Button
        if (v == button) {

        }
    }
} //Main Class
