package edu.temple.fragmentswithspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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
    public void ColorSelected() {
       // Toast.makeText(getBaseContext(), "it works" , Toast.LENGTH_SHORT ).show();
        f2.changeColor2();
    }
}
