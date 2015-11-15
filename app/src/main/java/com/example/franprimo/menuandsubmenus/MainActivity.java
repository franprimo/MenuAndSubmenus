package com.example.franprimo.menuandsubmenus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        Toast t;

        switch (item.getItemId()){
            case R.id.opt1:
                t = Toast.makeText(getBaseContext(), "Opcion A seleccionada", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt2:
                t = Toast.makeText(getBaseContext(), "Opcion B seleccionada", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt3:
                t = Toast.makeText(getBaseContext(), "Radio seleccionado 1", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt4:
                t = Toast.makeText(getBaseContext(), "Radio seleccionado 2", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt5:
                t = Toast.makeText(getBaseContext(), "Radio seleccionado 3", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt6:
                t = Toast.makeText(getBaseContext(), "Has entrado en el submenu", Toast.LENGTH_LONG);
                t.show();
                break;
            case R.id.opt7:
                t = Toast.makeText(getBaseContext(), "Ya no queda camino!", Toast.LENGTH_LONG);
                t.show();
                break;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
