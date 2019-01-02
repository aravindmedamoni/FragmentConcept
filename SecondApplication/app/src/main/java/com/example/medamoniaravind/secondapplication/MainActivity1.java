package com.example.medamoniaravind.secondapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
    }
    public void firstFragment(View view){
        FragmentF fragmentF=new FragmentF();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragmentF).commit();
    }
    public void secondFragment(View view){
        FragmentS fragmentS=new FragmentS();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragmentS).commit();
    }
}
