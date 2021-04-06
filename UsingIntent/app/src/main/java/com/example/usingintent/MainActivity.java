package com.example.usingintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int requestCode = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view)
    {
        startActivityForResult(new Intent(this,SecondActivity.class),requestCode);
    }

    public  void onActivityResult(int reqCode, int resultCode, Intent data)
    {
        if(reqCode == requestCode)
        {
            if(resultCode == RESULT_OK)
            {
                Toast.makeText(this,data.getData().toString(),Toast.LENGTH_SHORT).show();
            }
        }
    }
}