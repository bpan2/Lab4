package com.vic.lab4;



import android.app.Fragment;



public class FragmentOneBK extends Fragment{
   /* ImageView iv1=null;
    private MainActivity.ActivityCommunicator activityCommunicator;

    public interface FragmentCommunicator{
        public void passDataToFragment(String someValue);
    }

    public FragmentOneBK() {
        // Required empty public constructor
    }

    public static FragmentOneBK newInstance(){
        return new FragmentOneBK();
    }

    @Override
    public void onAttach(Activity activity){
        super.onAttach(activity);
        context = getActivity();
        activityCommunicator =(ActivityCommunicator)context;
    }
    //now on your entire fragment use context rather than getActivity()
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null)
            activityAssignedValue = savedInstanceState.getString(STRING_VALUE);
    }
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STRING_VALUE,activityAssignedValue);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_fragment_one, container, false);
        iv1 = (ImageView)v.findViewById(R.id.iv1);

        Bundle bundle1 = this.getArguments();
        String imgsrc1 = bundle1.getString("imgsrc1");

        iv1.setImageResource(R.drawable.wc2n);

        return v;
    }
*/
}
