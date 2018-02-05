package silvanet.com.mx.practica2_peliculas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis Alfredo on 01/02/2018.
 */

public class AdapterPeliculas extends RecyclerView.Adapter<AdapterPeliculas.ViewHolderPeliculas> implements View.OnClickListener {

    ArrayList<Pelicula> listaPeliculas;
    private View.OnClickListener listener;

    public AdapterPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    @Override
    public ViewHolderPeliculas onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_peliculas,null,false);
        view.setOnClickListener(this);
        return new ViewHolderPeliculas(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderPeliculas holder, int position) {

        holder.imagen.setImageResource(listaPeliculas.get(position).getImagen());
        holder.txtTitulo.setText(listaPeliculas.get(position).getTitulo());
        holder.txtGenero.setText(listaPeliculas.get(position).getGenero());
        holder.txtFecha.setText(listaPeliculas.get(position).getFecha());
        holder.txtRanking.setText(listaPeliculas.get(position).getRanking());
        holder.txtPrecio.setText(listaPeliculas.get(position).getPrecio());

    }

    @Override
    public int getItemCount() {
        return listaPeliculas.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }

    @Override
    public void onClick(View v) {
        if (listener!=null){
            listener.onClick(v);
        }

    }

    public class ViewHolderPeliculas extends RecyclerView.ViewHolder {

        ImageView imagen;
        TextView txtTitulo, txtGenero, txtFecha, txtRanking, txtPrecio;

        public ViewHolderPeliculas(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.IdImagen);
            txtTitulo = (TextView) itemView.findViewById(R.id.IdTitulo);
            txtGenero = (TextView) itemView.findViewById(R.id.IdGenero);
            txtFecha = (TextView) itemView.findViewById(R.id.IdFecha);
            txtRanking = (TextView) itemView.findViewById(R.id.IdRanking);
            txtPrecio = (TextView) itemView.findViewById(R.id.IdPrecio);

        }
    }
}
