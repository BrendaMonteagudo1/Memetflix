import java.util.*;
public class Temporada {
    public int numero;
    public String nombreDeTemporada;
    public int cantidadDeEpisodio;
    public int añoDeLanzamiento;
    public String nombre;

    public List<Actor>actores =new ArrayList<>();

    public List<Episodio> episodios = new ArrayList<>();

 
    public Episodio buscarEpisodio (int numeroEpisodio) {
        for (Episodio episodio : this.episodios) {
            if (episodio.numero == numeroEpisodio) {
                return episodio;
            }
            return null;
        }
        return null;
    }

}
