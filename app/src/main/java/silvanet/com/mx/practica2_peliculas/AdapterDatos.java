package silvanet.com.mx.practica2_peliculas;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis Alfredo on 01/02/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> implements View.OnClickListener {

    ArrayList<String> listDatos;

    public AdapterDatos(ArrayList<String> listDatos) {
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));

    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    @Override
    public void onClick(View v) {

    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {

        TextView dato;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato=(TextView) itemView.findViewById(R.id.IdDato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}
