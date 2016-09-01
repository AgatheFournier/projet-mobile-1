package com.ioweb.concertplace;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

import java.util.ArrayList;

public class ArtistesSortActivity extends AppCompatActivity implements OnItemSelectedListener {

    private Spinner spinner;
    private String spinner_value = "";

    // deuxième spinner
    private Spinner spinner2;
    private String spinner_valueTwo = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_artistes_sort);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        Spinner spinnerTwo = (Spinner) findViewById(R.id.spinner2);

        spinner.setOnItemSelectedListener(this);
        spinnerTwo.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("");
        categories.add("AC/DC");
        categories.add("Fat_Freddy");
        categories.add("Guns_N_Roses");
        categories.add("Jamiroquai");
        categories.add("Lenny_Kravitz");
        categories.add("The_Pixies");
        categories.add("The_Wolves");

        // Deuxième Spinner Drop down elements
        List<String> categories2 = new ArrayList<String>();
        categories2.add("");
        categories2.add("Lyon");
        categories2.add("Toulouse");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        // spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        //    @Override
        //    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //        Intent launchListConcertAcdc = new Intent(YourActivity.this, ConcertsAcdcActivity.class);
        //        startActivity(launchListConcertAcdc);
        //    }
        // });




        // je veux que le toast "Aucune selection entre" apparaisse si la selection est vide.
        // spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           // @Override
            // public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            //  if (view == categories.add("");){
            //        then (Toast.makeText(getApplicationContext(), "Aucune selection entree", Toast.LENGTH_LONG).show();
            //    } else ( Toast.makeText(this, "Artiste selectionne: " + parent.getSelectedItem().toString(), Toast.LENGTH_LONG).show();)

            // }

        // deuxième spinner
        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapterTwo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories2);
        // Drop down layout style - list view with radio button
        dataAdapterTwo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // attaching data adapter to spinner
        spinnerTwo.setAdapter(dataAdapterTwo);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        // on a 2 spinners, donc il faut implémenter un switch selection in the onItemSlected() method
        // pour savoir quel widget a été sélectionné.

        switch (parent.getId()) {
            case R.id.spinner:
                //Do something
                Toast.makeText(this, "Artiste selectionne: " + parent.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                break;
            case R.id.spinner2:
                //Do another thing
                Toast.makeText(this, "Ville selectionnee: " + parent.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
                break;
        }}

        public void onNothingSelected(AdapterView<?> arg0) {
        Toast.makeText(getApplicationContext(), "Aucune selection entree", Toast.LENGTH_LONG).show();
        }

}







