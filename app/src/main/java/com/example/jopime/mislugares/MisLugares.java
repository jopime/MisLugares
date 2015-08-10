package com.example.jopime.mislugares;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * Created by jopime on 4/8/15. Lanzada tras pulsar Mis lugares muestra lista con todos los lugares
 * creado (Idea propia el tutorial la sustituia por el main antiguo)
 */
    public class MisLugares extends ActionBarActivity
        implements AdapterView.OnItemClickListener{
        public BaseAdapter adaptador;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.mislugareslista);
            adaptador = new AdaptadorLugares(this);
            ListView listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adaptador);
            listView.setOnItemClickListener(this);

        }
    @Override
    public void onItemClick(AdapterView parent, View vista,
                            int posicion, long id){
        Intent i = new Intent(this, VistaLugar.class);
        i.putExtra("id", id);
        startActivity(i);
    }
}
