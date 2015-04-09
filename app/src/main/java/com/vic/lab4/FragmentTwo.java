package com.vic.lab4;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class FragmentTwo extends Fragment {

    ImageView iv2 = null;
    static boolean swap2 = false;

    public FragmentTwo() { // Required empty public constructor
    }

    public static FragmentTwo newInstance(){
        return new FragmentTwo();
    }


    @Override
    public void onStart() {
        super.onStart();

        Bundle args = getArguments();
        if (args != null) {
            updateImageView(args.getBoolean("swap"));
        } else{
            updateImageView(swap2);
        }
    }

    public void updateImageView(Boolean swap) {
        iv2 = (ImageView) getActivity().findViewById(R.id.iv2);

        if(swap != null){
            if(swap2 == swap){
                iv2.setImageResource(R.drawable.wc2n);
            }
            else {
                iv2.setImageResource(R.drawable.wc1n);
            }
        }
        else{
            iv2.setImageResource(R.drawable.wc2n);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_fragment_two, container, false);
        return v;
    }


}
