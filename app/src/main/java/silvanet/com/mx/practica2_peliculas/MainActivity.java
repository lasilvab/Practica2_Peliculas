package silvanet.com.mx.practica2_peliculas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pelicula> listaPeliculas;
    RecyclerView recyclerPeliculas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPeliculas = (RecyclerView) findViewById(R.id.RecyclerId);
        recyclerPeliculas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        listaPeliculas = new ArrayList<>();

        llenarPeliculas();

        AdapterPeliculas adapter = new AdapterPeliculas(listaPeliculas);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Seleccionaste: "+listaPeliculas.get
                        (recyclerPeliculas.getChildAdapterPosition(v)).getTitulo(),Toast.LENGTH_SHORT).show();

                Pelicula pelicula = listaPeliculas.get(recyclerPeliculas.getChildAdapterPosition(v));

                Intent intent=new Intent(MainActivity.this,DetailActivity.class);

                Bundle bundle=new Bundle();
                bundle.putSerializable("pelicula",pelicula);

                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


        recyclerPeliculas.setAdapter(adapter);

    }

    //** Aquí es donde se van a llenar los registros de las películas **
    private void llenarPeliculas() {
        listaPeliculas.add(new Pelicula(R.drawable.the_godfather,getString(R.string.peli_01_titulo),getString(R.string.peli_01_genero),getString(R.string.peli_01_director),getString(R.string.peli_01_fecha),getString(R.string.peli_01_ranking),getString(R.string.peli_01_precio),getString(R.string.peli_01_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.la_vita_e_bella,getString(R.string.peli_02_titulo),getString(R.string.peli_02_genero),getString(R.string.peli_02_director),getString(R.string.peli_02_fecha),getString(R.string.peli_02_ranking),getString(R.string.peli_02_precio),getString(R.string.peli_02_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.schindler_list,getString(R.string.peli_03_titulo),getString(R.string.peli_03_genero),getString(R.string.peli_03_director),getString(R.string.peli_03_fecha),getString(R.string.peli_03_ranking),getString(R.string.peli_03_precio),getString(R.string.peli_03_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.the_lord_of_the_rings,getString(R.string.peli_04_titulo),getString(R.string.peli_04_genero),getString(R.string.peli_04_director),getString(R.string.peli_04_fecha),getString(R.string.peli_04_ranking),getString(R.string.peli_04_precio),getString(R.string.peli_04_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.forrest_gump,getString(R.string.peli_05_titulo),getString(R.string.peli_05_genero),getString(R.string.peli_05_director),getString(R.string.peli_05_fecha),getString(R.string.peli_05_ranking),getString(R.string.peli_05_precio),getString(R.string.peli_05_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.gladiator,getString(R.string.peli_06_titulo),getString(R.string.peli_06_genero),getString(R.string.peli_06_director),getString(R.string.peli_06_fecha),getString(R.string.peli_06_ranking),getString(R.string.peli_06_precio),getString(R.string.peli_06_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.the_pianist,getString(R.string.peli_07_titulo),getString(R.string.peli_07_genero),getString(R.string.peli_07_director),getString(R.string.peli_07_fecha),getString(R.string.peli_07_ranking),getString(R.string.peli_07_precio),getString(R.string.peli_07_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.the_silence_of_the_lambs,getString(R.string.peli_08_titulo),getString(R.string.peli_08_genero),getString(R.string.peli_08_director),getString(R.string.peli_08_fecha),getString(R.string.peli_08_ranking),getString(R.string.peli_08_precio),getString(R.string.peli_08_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.inglourious_basterds,getString(R.string.peli_09_titulo),getString(R.string.peli_09_genero),getString(R.string.peli_09_director),getString(R.string.peli_09_fecha),getString(R.string.peli_09_ranking),getString(R.string.peli_09_precio),getString(R.string.peli_09_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.saving_private_ryan,getString(R.string.peli_10_titulo),getString(R.string.peli_10_genero),getString(R.string.peli_10_director),getString(R.string.peli_10_fecha),getString(R.string.peli_10_ranking),getString(R.string.peli_10_precio),getString(R.string.peli_10_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.casablanca,getString(R.string.peli_11_titulo),getString(R.string.peli_11_genero),getString(R.string.peli_11_director),getString(R.string.peli_11_fecha),getString(R.string.peli_11_ranking),getString(R.string.peli_11_precio),getString(R.string.peli_11_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.titanic,getString(R.string.peli_12_titulo),getString(R.string.peli_12_genero),getString(R.string.peli_12_director),getString(R.string.peli_12_fecha),getString(R.string.peli_12_ranking),getString(R.string.peli_12_precio),getString(R.string.peli_12_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.avatar,getString(R.string.peli_13_titulo),getString(R.string.peli_13_genero),getString(R.string.peli_13_director),getString(R.string.peli_13_fecha),getString(R.string.peli_13_ranking),getString(R.string.peli_13_precio),getString(R.string.peli_13_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.the_lion_king,getString(R.string.peli_14_titulo),getString(R.string.peli_14_genero),getString(R.string.peli_14_director),getString(R.string.peli_14_fecha),getString(R.string.peli_14_ranking),getString(R.string.peli_14_precio),getString(R.string.peli_14_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.terminator_2_judgment_day,getString(R.string.peli_15_titulo),getString(R.string.peli_14_genero),getString(R.string.peli_15_director),getString(R.string.peli_15_fecha),getString(R.string.peli_15_ranking),getString(R.string.peli_15_precio),getString(R.string.peli_15_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.the_sixth_sense,getString(R.string.peli_16_titulo),getString(R.string.peli_16_genero),getString(R.string.peli_16_director),getString(R.string.peli_16_fecha),getString(R.string.peli_16_ranking),getString(R.string.peli_16_precio),getString(R.string.peli_16_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.intouchables,getString(R.string.peli_17_titulo),getString(R.string.peli_17_genero),getString(R.string.peli_17_director),getString(R.string.peli_17_fecha),getString(R.string.peli_17_ranking),getString(R.string.peli_17_precio),getString(R.string.peli_17_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.indiana_jones_raiders_of_the_lost_ark,getString(R.string.peli_18_titulo),getString(R.string.peli_18_genero),getString(R.string.peli_18_director),getString(R.string.peli_18_fecha),getString(R.string.peli_18_ranking),getString(R.string.peli_18_precio),getString(R.string.peli_18_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.up,getString(R.string.peli_19_titulo),getString(R.string.peli_19_genero),getString(R.string.peli_19_director),getString(R.string.peli_19_fecha),getString(R.string.peli_19_ranking),getString(R.string.peli_19_precio),getString(R.string.peli_19_descripcion)));

        listaPeliculas.add(new Pelicula(R.drawable.django_unchained,getString(R.string.peli_20_titulo),getString(R.string.peli_20_genero),getString(R.string.peli_20_director),getString(R.string.peli_20_fecha),getString(R.string.peli_20_ranking),getString(R.string.peli_20_precio),getString(R.string.peli_20_descripcion)));
    }

}
