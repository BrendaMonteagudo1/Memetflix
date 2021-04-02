
import java.util.*;

public class Serie extends Contenido {
    public String nombre;
    public int cantidadDeTemporadas;
    public int añoDeLanzamiento;
    public List<Temporada> temporada = new ArrayList<>();

    public Temporada buscarTemporada (int numeroTemporada) {
        for (Temporada temporada : this.temporada) {
            if (temporada.numero == numeroTemporada) {
                return temporada;
            }
            return null;
        }
        return null;
    }
}
