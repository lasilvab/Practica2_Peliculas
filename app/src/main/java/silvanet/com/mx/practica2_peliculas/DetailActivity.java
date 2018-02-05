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
    TextView txtTitulo, txtGenero, txtFecha, txtRanking, txtPrecio;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imagen = (ImageView) findViewById(R.id.IdImagen);
        txtTitulo = (TextView) findViewById(R.id.IdTitulo);
        txtGenero = (TextView) findViewById(R.id.IdGenero);
        txtFecha = (TextView) findViewById(R.id.IdFecha);
        txtRanking = (TextView) findViewById(R.id.IdRanking);
        txtPrecio = (TextView) findViewById(R.id.IdPrecio);

        Bundle peliculaSelected = getIntent().getExtras();
        Pelicula pelicula=null;

        if (peliculaSelected!=null){
            pelicula= (Pelicula) peliculaSelected.getSerializable("pelicula");

            imagen.setImageResource(pelicula.getImagen());
            txtTitulo.setText(pelicula.getTitulo());
            txtGenero.setText(pelicula.getGenero());
            txtFecha.setText(pelicula.getFecha());
            txtRanking.setText(pelicula.getRanking());
            txtPrecio.setText(pelicula.getPrecio());
        }

    }




}
