package silvanet.com.mx.practica2_peliculas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by LuisAlfredoSilva on 05/02/2018.
 */

public class DetailActivity extends AppCompatActivity{

    ImageView imagen=null;
    TextView txtTitulo, txtGenero, txtDirector, txtCompania, txtFecha,
             txtProtagonista, txtNivel, txtRanking, txtPrecio, txtDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imagen = (ImageView) findViewById(R.id.IdImagen);
        txtTitulo = (TextView) findViewById(R.id.IdTitulo);
        txtGenero = (TextView) findViewById(R.id.IdGenero);
        txtDirector = (TextView) findViewById(R.id.IdDirector);
        txtCompania = (TextView) findViewById(R.id.IdCompania);
        txtFecha = (TextView) findViewById(R.id.IdFecha);
        txtProtagonista = (TextView) findViewById(R.id.IdProtagonista);
        txtNivel = (TextView) findViewById(R.id.IdNivel);
        txtRanking = (TextView) findViewById(R.id.IdRanking);
        txtPrecio = (TextView) findViewById(R.id.IdPrecio);
        txtDescripcion = (TextView) findViewById(R.id.IdDescripcion);

        Bundle peliculaSelected = getIntent().getExtras();
        Pelicula pelicula=null;

        if (peliculaSelected!=null){
            pelicula= (Pelicula) peliculaSelected.getSerializable("pelicula");

            imagen.setImageResource(pelicula.getImagen());
            txtTitulo.setText(pelicula.getTitulo());
            txtGenero.setText("Género: "+pelicula.getGenero());
            txtDirector.setText("Director: "+pelicula.getDirector());
            txtCompania.setText("Compañía Cinematográfica: "+pelicula.getCompania());
            txtFecha.setText("Fecha de publicación: "+pelicula.getFecha());
            txtProtagonista.setText("Protagonista(s): "+pelicula.getProtagonista());
            txtNivel.setText("Nivel de audiencia: "+pelicula.getNivel());
            txtRanking.setText("Ranking: "+pelicula.getRanking());
            txtPrecio.setText("Precio: "+pelicula.getPrecio());
            txtDescripcion.setText("Descripción: "+pelicula.getDescripcion());
        }

    }




}
