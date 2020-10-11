package com.example.biblioteca_digital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private ProgressBar pgbar;
    private Button btton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //button
        btton1 = (Button)findViewById(R.id.btton);
        // llamo al identificador para poder usar el boton mediante codigo
                 btton1.setOnClickListener(new View.OnClickListener() {
                  @Override
                  public void onClick(View view) {
                    new task().execute();
                  }
                 });
        //progresbar
        pgbar=(ProgressBar)findViewById(R.id.pgbar);
        //coloco el progres var de inicio invisible
        pgbar.setVisibility(View.INVISIBLE);


    }
    // se crea la activida asincronica (progresbar)
    class task extends AsyncTask<String, Void,String> {

        @Override// aqui configuracion inicial de barra de progreso
        protected void onPreExecute() { // inicio
            pgbar.setVisibility(View.VISIBLE);
        }
        @Override //en esta parte se corren las tareas pesadas
        protected String doInBackground(String... strings) { //desarollo
            for( int i= 1; i<=10; i++){
                try { // ejecuta esta sentencia por milmilesegundo
                    Thread.sleep(1000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
            return null;
        }
        @Override
        protected void onPostExecute(String s) {//final
            pgbar.setVisibility(View.INVISIBLE  );//desaparesco el progresbar
            Intent i = new Intent(getApplicationContext(),Github_act.class);
            startActivity(i);
        }
    }

}
