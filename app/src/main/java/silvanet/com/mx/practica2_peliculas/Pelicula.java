package silvanet.com.mx.practica2_peliculas;

import java.io.Serializable;

/**
 * Created by Luis Alfredo on 01/02/2018.
 */

public class Pelicula implements Serializable {

    private int imagen;
    private String titulo=null;
    private String genero=null;
    private String director=null;
    private String compania=null;
    private String fecha=null;
    private String protagonista=null;
    private String nivel=null;
    private String ranking=null;
    private String precio=null;
    private String descripcion=null;

    public Pelicula(){

    }


    public Pelicula(int imagen, String titulo, String genero, String director, String compania, String fecha,
                    String protagonista, String nivel, String ranking, String precio, String descripcion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.compania = compania;
        this.fecha = fecha;
        this.protagonista = protagonista;
        this.nivel = nivel;
        this.ranking = ranking;
        this.precio = precio;
        this.descripcion = descripcion;

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

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public String getCompania() {
        return compania;
    }
    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFeccha(String feccha) {
        this.fecha = feccha;
    }

    public String getProtagonista() {
        return protagonista;
    }
    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String precio) {
        this.descripcion = descripcion;
    }
}
