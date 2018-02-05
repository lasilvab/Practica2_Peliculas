package silvanet.com.mx.practica2_peliculas;

import java.io.Serializable;

/**
 * Created by Luis Alfredo on 01/02/2018.
 */

public class Pelicula implements Serializable {

    private int imagen;
    private String titulo;
    private String genero;
    private String fecha;
    private String ranking;
    private String precio;

    public Pelicula(){

    }


    public Pelicula(int imagen, String titulo, String genero, String fecha, String ranking, String precio) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.ranking = ranking;
        this.precio = precio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFeccha(String feccha) {
        this.fecha = feccha;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}
