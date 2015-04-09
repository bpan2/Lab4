package com.vic.lab4;


import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class FragmentOne extends Fragment {

    ImageView iv1=null;
    static boolean swap1 = false;

    public FragmentOne() { // Required empty public constructor
    }

    public static FragmentOne newInstance(){
        return new FragmentOne();
    }


    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        if (args != null) {
            updateImageView(args.getBoolean("swap"));
        } else{
            updateImageView(swap1);
        }
    }




    public void updateImageView(Boolean swap) {

        iv1 = (ImageView) getActivity().findViewById(R.id.iv1);

        if(swap != null){
            if(swap1 == swap){
                iv1.setImageResource(R.drawable.wc1n);
            }
            else {
                iv1.setImageResource(R.drawable.wc2n);
            }
        }
        else{
            iv1.setImageResource(R.drawable.wc1n);
        }
    }


    //now on your entire fragment use context rather than getActivity()
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_fragment_one, container, false);
        return v;
    }

}
