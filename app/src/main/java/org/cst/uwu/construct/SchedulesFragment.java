package org.cst.uwu.construct;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class SchedulesFragment extends Fragment {


    public static final int FRAGMENT_TAG = 100901;
    private TextView textView_welcome, textView_rep_name, textView_route;
    private Button btn_next, btn_Exit;



    public static SchedulesFragment newInstance() {
        return new SchedulesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.activity_home, container,
                false);






        ///////////////////set language/////////////







        return rootView;

    }

    @Override
    public void onDestroy() {


        super.onDestroy();
    }

    View.OnClickListener exit = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {

            System.exit(0);


        }
    };

    View.OnClickListener cancel = new View.OnClickListener() {

        @Override
        public void onClick(View arg0) {


        }
    };
}
