package silvanet.com.mx.practica2_peliculas;

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
            }
        });

        recyclerPeliculas.setAdapter(adapter);
        
    }

    //** Aquí es donde se van a llenar los registros de las películas **
    private void llenarPeliculas() {
        listaPeliculas.add(new Pelicula(R.drawable.the_godfather,"El padrino","Drama","1972","9.0","1257"));
        listaPeliculas.add(new Pelicula(R.drawable.la_vita_e_bella,"La vida es bella","Comedia dramática","1997","8.5","3275"));
        listaPeliculas.add(new Pelicula(R.drawable.schindler_list,"La lista de Schindler","Drama, Nazismo","1993","8.7","5678"));
        listaPeliculas.add(new Pelicula(R.drawable.the_lord_of_the_rings,"El señor de los anillo - El retorno del rey","Fantástico. Aventuras","2003","8.1","8925"));
        listaPeliculas.add(new Pelicula(R.drawable.forrest_gump,"Forrest Gump","Comedia. Drama","1994","8.2","2457"));
        listaPeliculas.add(new Pelicula(R.drawable.gladiator,"Gladiador","Acción. Aventuras","2000","7.9","3576"));
        listaPeliculas.add(new Pelicula(R.drawable.the_pianist,"El pianista","Drama, Nazismo","2002","8.3","4268"));
        listaPeliculas.add(new Pelicula(R.drawable.the_silence_of_the_lambs,"El silencio de los inocentes","Thriller","1991","8.2","2589"));
        listaPeliculas.add(new Pelicula(R.drawable.inglourious_basterds,"Bastardos sin gloria","Bélico. Acción","2009","7.8","3458"));
        listaPeliculas.add(new Pelicula(R.drawable.saving_private_ryan,"Rescatando al soldado Ryan","Bélico","1998","7.8","4257"));
        listaPeliculas.add(new Pelicula(R.drawable.casablanca,"Casablanca","Drama. Romance","1942","8.4","1357"));
        listaPeliculas.add(new Pelicula(R.drawable.titanic,"Titanic","Drama. Romance","1997","6.8","6875"));
        listaPeliculas.add(new Pelicula(R.drawable.avatar,"Avatar","Ciencia ficción","2009","7.2","7257"));
        listaPeliculas.add(new Pelicula(R.drawable.the_lion_king,"El rey león","Animación","1994","7.9","5689"));
        listaPeliculas.add(new Pelicula(R.drawable.terminator_2_judgment_day,"Terminator 2 - El día del juicio","Ciencia ficción","1991","7.5","5267"));
        listaPeliculas.add(new Pelicula(R.drawable.the_sixth_sense,"El sexto sentido","Terror","1999","7.6","3257"));
        listaPeliculas.add(new Pelicula(R.drawable.intouchables,"Amigos","","2011","8.1","3684"));
        listaPeliculas.add(new Pelicula(R.drawable.indiana_jones_raiders_of_the_lost_ark,"Indiana Jones: Los cazadores del arca perdida","Aventuras. Acción","1981","7.8","4689"));
        listaPeliculas.add(new Pelicula(R.drawable.up,"Up, una aventura de altura","Animación","2009","7.9","4269"));
        listaPeliculas.add(new Pelicula(R.drawable.django_unchained,"Django sin cadenas","Western","2012","7.9","5678"));
    }


}
