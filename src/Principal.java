import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //Creo un Objeto llamado miPelicula tipo com.aluracursos.screenmatch.modelos.Pelicula a de la clase pelicula.
        miPelicula.setNombre("Encanto"); //Agrego atributo nombre utilizando el metodo .setnombre
        miPelicula.setFechaDeLanzamiento(2021); //Agrego atributo fecha utilizando el metodo .setfechaDeLanzamiento.
        miPelicula.setDuracionEnMinutos(120);//Agrego atributo duracionEnMinutos utilizando el metodo .setduracionEnMinutos
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestreFichaTecnica(); // Llamo al metodo muestreFichaTecnica.
        miPelicula.evalua(7.8); // Llamo al metodo evalua
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
        //miPelicula.TotalDeLasEvaluaciones(); //El codigo ya no permite esta linea en class Principal. Debido a que le pude private en la class pelicula.

//        com.aluracursos.screenmatch.modelos.Pelicula otraPelicula = new com.aluracursos.screenmatch.modelos.Pelicula(); // crea otro objeto y creo espacio ahora en memoria para este objeto que se llama otraPelicula".
//        otraPelicula.nombre = "Matrix";
//        otraPelicula.fechaDeLanzamiento = 1998;
//        otraPelicula.duracionEnMinutos = 180;
//
//        otraPelicula.muestraFichaTecnica();
    }
}
