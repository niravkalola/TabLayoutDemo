package nkdroid.tutorial.tablayout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SampleFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    boolean _areLecturesLoaded = false;
    private int mParam1;

    private TextView tabText;


    public SampleFragment() {
        // Required empty public constructor
    }

    public static SampleFragment newInstance(int param1) {
        SampleFragment fragment = new SampleFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View convertView=inflater.inflate(R.layout.fragment_sample, container, false);
        tabText= (TextView) convertView.findViewById(R.id.tabText);
        tabText.setText("Tab Layout No " + mParam1);


        return convertView;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser && !_areLecturesLoaded ) {
//            loadLectures();
            Log.e("first fragment", "loaded");
            _areLecturesLoaded = true;
        }
    }
}
