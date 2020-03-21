package edu.temple.fragmentswithspinner;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class CanvasFragment extends Fragment {

    private static final String ID_KEY = "id";
    private View layout;
    int id;

    public CanvasFragment() {
        // Required empty public constructor
    }
    public static CanvasFragment newInstance (int id) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ID_KEY, id);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        if (bundle != null) {
            id = bundle.getInt("id");
        }
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
        CanvasFragment.newInstance(id);
    }
    public int getFragmentId() {
        return id;
    }
}
