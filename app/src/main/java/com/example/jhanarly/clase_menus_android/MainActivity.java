package com.example.jhanarly.clase_menus_android;

import android.app.Activity;
import android.content.Intent;//libreria para llamar a otra actividad
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    TextView txt01;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt01=(TextView) findViewById(R.id.Txt_result);

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
            case R.id.action_settings: return true;
            //
            case R.id.inicio:
                //
            case R.id.opcion1:
                Intent opc1 = new Intent(this, opcion1Activity.class); startActivity(opc1); // clase que permite llamar a otra actividad
                return true;
            //
            case R.id.opcion2:
                Intent opc2 = new Intent(this, Activity_opcion2.class); startActivity(opc2); // clase que permite llamar a otra actividad
                return true;
            case R.id.opcion1_1:return true;
            default: return super.onOptionsItemSelected(item);

        }
    }
}