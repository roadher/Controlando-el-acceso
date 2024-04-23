public class Pelicula {
    String nombre; //Atributo del objeto Pelicula //Creo metodo nombre
    int fechaDeLanzamiento; //Creo metodo fechaDeLanzamiento para luego agregar atributos a los objetos.
    int duracionEnMinutos; //Creo metodo duracionEnMinutos para luego agregar atributos a los objetos.
    boolean incluidoEnElPlan; //Creo metodo incluidoEnElPlan para luego agregar atributos a los objetos.
    double sumaDeLasEvaluaciones;
    int totalDeLasEvaluaciones;


    void muestreFichaTecnica(){//Los metodos se hace con frases imperativas.
                               //Metodo tipo void. Es una funcion que puede ser llamada
        System.out.println("El nombre de la pelicula es: "+nombre);
        System.out.println("Su fecha de lanzamiento es: "+fechaDeLanzamiento);
        System.out.println("Duracion de minutos: "+duracionEnMinutos);
    }

    void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

}
