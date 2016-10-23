package com.himanshusharmahs974gmail.vibgyorlinear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
Button button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.bu);
        button.setOnClickListner(new OnClickListner(){
            public void onClick(View v){
                Toast.makeText(getBaseContext(), "Vibgyor app!" , Toast.LENGTH_SHORT ).show()}});
        
        
    }
}
