package com.example.jhanarly.clase_menus_android;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class opcion1Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcion1);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                return true;
                //
            case R.id.inicio:
                Intent main = new Intent(this, MainActivity.class);
                startActivity(main); // clase que permite llamar a otra actividad
                return true;
                //
            case R.id.opcion1:
                Intent opc1 = new Intent(this, opcion1Activity.class);
                startActivity(opc1); // clase que permite llamar a otra actividad
                return true;
               //
            case R.id.opcion2: Intent opc2 = new Intent(this, opcion1Activity.class);
                startActivity(opc2);
                return true;
            case R.id.opcion1_1:
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
