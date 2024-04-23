public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula(); //Ahora pelicula se creo como tipo de dato y es una clase. Tambien se crea una nueva instancia.
                                              //Nueva instancia:  crea en memoria un espacio para ese objeto que puede contener diferentes atributos y cada atributo puede contener un valor.
                                              //Creo un Objeto llamado miPelicula tipo Pelicula a de la clase pelicula.
        miPelicula.nombre = "Encanto"; //Agrego atributo nombre utilizando el metodo .nombre
        miPelicula.fechaDeLanzamiento = 2021; //Agrego atributo fecha utilizando el metodo .fechaDeLanzamiento.
        miPelicula.duracionEnMinutos = 120; //Agrego atributo duracionEnMinutos utilizando el metodo .duracionEnMinutos

//        System.out.println("Mi pelicula es: "+miPelicula.nombre); //Imprimo el nombre con el metodo miPelicula.nombre
//        System.out.println("Su fecha de lanzamiento es: "+miPelicula.fechaDeLanzamiento); //Imprimo el nombre con el metodo miPelicula.fechaDeLanzamiento.
        miPelicula.muestreFichaTecnica(); // Llamo al metodo muestreFichaTecnica.
        miPelicula.evalua(7.8); // Llamo al metodo evalua
        miPelicula.evalua(10);

        System.out.println(miPelicula.sumaDeLasEvaluaciones);
        System.out.println(miPelicula.totalDeLasEvaluaciones);
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula(); // crea otro objeto y creo espacio ahora en memoria para este objeto que se llama otraPelicula".
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

//        System.out.println("Mi pelicula es: "+otraPelicula.nombre);
//        System.out.println("Su fecha de lanzamiento es: "+otraPelicula.fechaDeLanzamiento);
//        otraPelicula.muestreFichaTecnica();// Llamo al metodo muestreFichaTecnica.


    }
}
