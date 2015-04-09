package com.vic.lab4;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    boolean swap = false;
    FragmentOne fragOne = null;
    FragmentTwo fragTwo = null;
    Button btn;
    FragmentManager fm = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragOne = new FragmentOne();
        fragTwo = new FragmentTwo();

        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragView, fragOne, "Fragment1");
        ft.addToBackStack("f1");
        ft.add(R.id.fragView, fragTwo, "Fragment2");
        ft.addToBackStack("f2");
        ft.commit();

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swap = swap == false ? true : false;

                if(fragOne != null){
                    fragOne.updateImageView(swap);
                }

                if(fragTwo != null){
                    fragTwo.updateImageView(swap);
                }
            }
        });
    }


}


