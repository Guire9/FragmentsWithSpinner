package edu.temple.fragmentswithspinner;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    private View layout;

    public CanvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout =inflater.inflate(R.layout.fragment_canvas, container, false);
        changeColor2(0);
        return layout;
    }
    public void changeColor2(int x) {
        layout.setBackgroundColor(x);

    }
}
