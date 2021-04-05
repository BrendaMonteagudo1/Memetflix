import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Memetflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<Genero> generos = new ArrayList<>();

    public void inicializarCatalogo() {

        Pelicula titanic = new Pelicula();
        titanic.nombre = "Titanic";
        titanic.genero = "Romantico";
        titanic.duracion = 123;
        titanic.añoDeLanzamiento = 1997;

        Actor actor = new Actor();
        actor.nombre = "Leonardo 'Entraba en la tabla' Di Caprio";
        actor.edad = 39;

        titanic.actores.add(actor);
        this.peliculas.add(titanic);

        Pelicula armagedon = new Pelicula();
        armagedon.nombre = "Armagedon";
        armagedon.genero = "Accion";
        armagedon.duracion = 210;
        armagedon.añoDeLanzamiento = 1990;

        actor = new Actor();
        actor.nombre = "Bruce Willis";
        actor.edad = 29;

        armagedon.actores.add(actor);
        this.peliculas.add(armagedon);

        /// serie///

        Serie sexEducation = new Serie();
        sexEducation.nombre = "Sex education";
        sexEducation.añoDeLanzamiento = 2009;

        actor = new Actor();
        actor.nombre = "Gilian Anderson";
        actor.edad = 45;

        sexEducation.actores.add(actor);

        Temporada temporada = new Temporada();
        temporada.nombre = "Piloto";
        temporada.numero = 2;

        Episodio episodio = new Episodio();
        episodio.nombre = "Episodio piloto";
        episodio.duracion = 50;


        sexEducation.temporada.add(temporada);

        this.series.add(sexEducation);

        // series.temporadas.add();

        Pelicula losIsleños = new Pelicula();
        losIsleños.nombre = "Los isleños";
        losIsleños.añoDeLanzamiento = 1980;
        losIsleños.genero = "Accion";

        actor = new Actor();
        actor.nombre = "Tita Merelo";

        this.peliculas.add(losIsleños);

        losIsleños.actores.add(actor);

        Serie newAms = new Serie();
        newAms.nombre = "New Amsterdan";
        newAms.añoDeLanzamiento = 2017;

        actor = new Actor();
        actor.nombre = "Pablo Perez";
        actor.edad = 35;

        newAms.actores.add(actor);

        Temporada temporada1 = new Temporada();
        temporada1.nombre = "Piloto";
        temporada1.numero = 1;

        episodio = new Episodio();
        episodio.nombre = "Lalalala";
        episodio.numero = 4;
        episodio.duracion = 65;

        temporada.episodios.add(episodio);


        episodio = new Episodio();
        episodio.nombre = "lelelulelo";
        episodio.numero = 4;
        episodio.duracion = 65;

        temporada.episodios.add(episodio);

        newAms.temporada.add(temporada);

    }

    public Serie buscarSerie(String buscarSerie) {
        for (Serie serie : this.series) {
            if (serie.nombre.equals(buscarSerie))
                return serie;
        }

        return null;
    }
}