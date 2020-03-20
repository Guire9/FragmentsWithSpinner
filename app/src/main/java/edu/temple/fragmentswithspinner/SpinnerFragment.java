package edu.temple.fragmentswithspinner;


import android.content.res.Resources;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpinnerFragment extends Fragment {


    public SpinnerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_spinner, container, false);

        Resources res = getResources();
        String[] colors = res.getStringArray(R.array.colors);

        Spinner spinner = (Spinner) rootView.findViewById(R.id.spinner);
        ColorAdapter adapter1 = new ColorAdapter(rootView.getContext(), colors);

        spinner.setAdapter(adapter1);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                view.setBackgroundColor(0xffffffff);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        return rootView;

    }
}
