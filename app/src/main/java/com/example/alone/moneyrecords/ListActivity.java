package com.example.alone.moneyrecords;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;


public class ListActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Button btn = (Button) this.findViewById(R.id.save);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Context context = getApplicationContext();
        String msg = "บันทึกเรียบร้อยแล้ว";
        int duration = Toast.LENGTH_SHORT;

        Toast t = Toast.makeText(context, msg, duration);
        t.show();
    }

}
