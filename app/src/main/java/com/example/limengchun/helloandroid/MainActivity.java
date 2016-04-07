package com.example.limengchun.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.content.Intent;
import android.widget.Button;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mBtn1 = (Button) findViewById(R.id.mBtn1);
        mBtn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("clicks", "You Clicked B1");
        Intent i=new Intent(this, MyReactActivity.class);
        //startActivityForResult(i, 0);
        startActivity(i);
    }
}