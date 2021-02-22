// Author: Hieu Dang
// Date: 02/20/2021
// Description: This project use ListActivity class to populate data from an array into a List

package com.example.newtechnologies;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String[] technologies = {"Air Taxi", "Automatic Car", "BlockChain", "Renewable Energy", "Rocket"};

        ArrayAdapter<String>arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_main, R.id.txtTechRow, technologies);

        setListAdapter(arrayAdapter);

    }

    /**
     * This method will be called when an item in the list is selected.
     * Subclasses should override. Subclasses can call
     * getListView().getItemAtPosition(position) if they need to access the
     * data associated with the selected item.
     *
     * @param l The ListView where the click happened
     * @param v The view that was clicked within the ListView
     * @param position The position of the view in the list
     * @param id The row id of the item that was clicked
     */
    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch(position){
            case 0:
                //Toast.makeText(this, "first", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Activity_AirTaxi.class));
                break;
            case 1:
                //Toast.makeText(this, "second", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Activity_AutomaticCar.class));
                break;
            case 2:
                //Toast.makeText(this, "third", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Activity_BlockChain.class));
                break;
            case 3:
                //Toast.makeText(this, "fourth", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Activity_RenewableEnergy.class));
                break;
            case 4:
                //Toast.makeText(this, "fifth", Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Activity_Rocket.class));
                break;
        }
    }
}