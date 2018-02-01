package silvanet.com.mx.practica2_peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = (RecyclerView) findViewById(R.id.RecyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        //** Aquí es donde se van a llenar los registros de las películas **
        listDatos = new ArrayList<String>();

        listDatos.add("Pelicula 1");
        listDatos.add("Pelicula 2");
        listDatos.add("Pelicula 3");
        listDatos.add("Pelicula 4");
        listDatos.add("Pelicula 5");
        listDatos.add("Pelicula 6");
        listDatos.add("Pelicula 7");
        listDatos.add("Pelicula 8");
        listDatos.add("Pelicula 9");
        listDatos.add("Pelicula 10");
        listDatos.add("Pelicula 11");
        listDatos.add("Pelicula 12");
        listDatos.add("Pelicula 13");
        listDatos.add("Pelicula 14");
        listDatos.add("Pelicula 15");
        listDatos.add("Pelicula 16");
        listDatos.add("Pelicula 17");
        listDatos.add("Pelicula 18");
        listDatos.add("Pelicula 19");
        listDatos.add("Pelicula 20");
        listDatos.add("Pelicula 21");
        listDatos.add("Pelicula 22");
        listDatos.add("Pelicula 23");
        listDatos.add("Pelicula 24");
        listDatos.add("Pelicula 25");
        listDatos.add("Pelicula 26");
        listDatos.add("Pelicula 27");
        listDatos.add("Pelicula 28");
        listDatos.add("Pelicula 29");
        listDatos.add("Pelicula 30");

        AdapterDatos adapter = new AdapterDatos(listDatos);
        recycler.setAdapter(adapter);

    }
}
