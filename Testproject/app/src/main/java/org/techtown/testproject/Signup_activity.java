package org.techtown.testproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup_activity extends AppCompatActivity {

    private Button btn_join;
    private EditText join_id;
    private  EditText join_pw;
    private  EditText join_pwpw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);

        join_id = (EditText)findViewById(R.id.join_id);
        join_pw = (EditText)findViewById(R.id.join_pw);
        join_pwpw = (EditText)findViewById(R.id.join_pwpw);

    }

    public  void goto_join(View v){
        String id = join_id.getText().toString();
        String pw = join_pw.getText().toString();
        String pwpw=join_pwpw.getText().toString();

        if(pw.equals(pwpw)) {

            Intent Intent = new Intent(Signup_activity.this, MainActivity.class);

            Intent.putExtra("id", id);
            Intent.putExtra("pw", pw);



            startActivity(Intent);
        }

        else
        {
            Toast.makeText(this,"pw is not same ",Toast.LENGTH_SHORT).show();
        }
    }
}
