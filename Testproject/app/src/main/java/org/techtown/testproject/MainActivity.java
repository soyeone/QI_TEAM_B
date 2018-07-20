package org.techtown.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText id_edit;
    private EditText pw_edit;
    private TextView textView2;
    public  String id;
    public  String pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id_edit = (EditText) findViewById(R.id.id_edit);
        pw_edit = (EditText)findViewById(R.id.pw_edit);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent Intent = getIntent();

        id = Intent.getStringExtra("id");
        pw = Intent.getStringExtra("pw");


        textView2.setText(id+pw);

    }

    public void goto_singup(View v){
        Intent Intent = new Intent(getApplicationContext(),Signup_activity.class);
        startActivity(Intent);
    }

    public void  goto_signin(View v){

        String in_id=id_edit.getText().toString();
        String in_pw=pw_edit.getText().toString();

        if(in_id.equals(id) && (in_pw.equals(pw))){

            Intent Intent = new Intent(getApplicationContext(),RealMain.class);
            startActivity(Intent);


        }

        else {
            Toast.makeText(this,"id or pw is wrong ",Toast.LENGTH_SHORT).show();
        }

     }
}
