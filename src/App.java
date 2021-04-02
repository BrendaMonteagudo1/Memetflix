public class App {
    public static void main(String[] args) throws Exception {

        /* A partir de Metflix, buscar la temporada 5 episodio 1 de la serie
        How I met your mother y reproducir el episodio. */

        Memetflix miMetflix = new Memetflix();

        System.out.println("Inicializando catalogo de Memetflix. ");
       
        miMetflix.inicializarCatalogo();

        Serie serieBuscada = miMetflix.buscarSerie("New Amsterdan");

        Temporada temporadaBuscada =  serieBuscada.buscarTemporada(1);

        Episodio episodioBuscado = temporadaBuscada.buscarEpisodio(4);
         
        episodioBuscado.reproducirEpisodio();


    }
}
