package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Github_act extends AppCompatActivity {
    private Spinner spinner;
    private TextView text1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);
        //declaro el texview
        text1=(TextView)findViewById(R.id.text1);
        //declaro el sppiner
        spinner = (Spinner) findViewById(R.id.spinner);
        //creo el array del spinner
        // se agregaron 2 libros mas en el array
        String[] NombreLibros = {"El Poder","Despertar", "Farenheith", "Revival", "El Alquimista"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, NombreLibros);
        spinner.setAdapter(adapter);// asocio el spinner con el array
    }
    public void opciones(View view) {
        //precios originales
        String opcion = spinner.getSelectedItem().toString();
        if (opcion.equals("Farenheith")) {
            int proucto1 = 70000; // se modifico el precio
            text1.setText(" valor total: "+ proucto1);
        }
        else if (opcion.equals("El Alquimista")) {
            int proucto1 = 220000; // se modifico el precio
            text1.setText(" valor total: "+ proucto1);
        }
        else if (opcion.equals("Revival")) {
            int proucto1 = 450000;
            text1.setText(" valor total: "+proucto1);
        }else if (opcion.equals("El Poder")) {
            int proucto1 = 880000;
            text1.setText(" valor total: "+ proucto1);
        }
        else if (opcion.equals("Despertar")) {
            int proucto1 = 1560000;
            text1.setText(" valor total: " + proucto1);
        }else
            text1.setText("");
    }
}
