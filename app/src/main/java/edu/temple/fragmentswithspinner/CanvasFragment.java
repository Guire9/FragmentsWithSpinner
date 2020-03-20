package edu.temple.fragmentswithspinner;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    View layout;
    public CanvasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout =inflater.inflate(R.layout.fragment_canvas, container, false);;
        changeColor2();
        return layout;
    }
    public void changeColor2() {
        int colors[] = {Color.RED, Color.BLUE, Color.GREEN, Color.GRAY, Color.MAGENTA, Color.CYAN};
        int colorIndex = (new Random()).nextInt(colors.length);
        layout.setBackgroundColor(colors[colorIndex]);

    }
}
