package edu.temple.fragmentswithspinner;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SpinnerFragment.ColorSelectedInterface {
    SpinnerFragment f1;
    CanvasFragment f2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f1 = new SpinnerFragment();
        f2 = new CanvasFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container1,f1)
              .add(R.id.container2,f2)
                .commit();

    }

    @Override
    public void ColorSelected(String c) {
        int x= Color.parseColor(c);
        f2.changeColor2(x);
    }
}
