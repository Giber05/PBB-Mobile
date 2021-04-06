package com.example.usingintent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends Activity
{
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClick(View view)
    {
        Intent data = new Intent();
        EditText textName = (EditText)findViewById(R.id.textUsername);
        data.setData(Uri.parse(textName.getText().toString()));
        setResult(RESULT_OK,data);
        finish();
    }
}
