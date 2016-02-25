package org.cst.uwu.construct;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;




public class HomeFragment extends Fragment {


    public static final int FRAGMENT_TAG = 100901;
    private TextView textView_welcome, textView_rep_name, textView_route;
    private Button btn_next, btn_Exit;



    public static HomeFragment newInstance() {
        return new HomeFragment();
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
