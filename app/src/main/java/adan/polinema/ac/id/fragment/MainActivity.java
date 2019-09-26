package adan.polinema.ac.id.fragment;

import adan.polinema.ac.id.fragment.activities.StaticActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickStaticFragment(View view) {
        Intent i = new Intent(this, StaticActivity.class);
        startActivity(i);
    }

    public void handlerClickDynamicFragment(View view) {
    }

    public void handlerClickPraktikumFragment(View view) {
    }
}
