package com.aluracursos.screenmatch.modelos;//Ahora yo existo en un package com.aluracursos...

//Separe la clase principal y clase pelicula en diferentes packeges.
//Los metodos y atributos ya no se pueden ver entre clases

public class Pelicula {
    private String nombre; //private no quiero que se use en el principal
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones; //private: que sea privada. Encapsulo double en private.
    private int totalDeLasEvaluaciones; //private: que el usuario no las pueda usar o ver. No lo puedo usar en la class principal.

    //Buscar como generar setter y getter

    public String getNombre() {//Sin los métodos getters, no es posible leer los atributos desde fuera de la clase.
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {//Le pido uruario ingrese un valor y lo guardo en variable nombre
        this.nombre = nombre; //this: le indico que es atributo de arriaba, por eso esta morado. lo paso de nombre a nombre
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){ //La hago public para que class principal pueda verla
        return totalDeLasEvaluaciones;
    }

    public void muestreFichaTecnica(){//Metodo tipo void. Es una funcion que puede ser llamada
        System.out.println("El nombre de la pelicula es: "+getNombre());
        System.out.println("Su fecha de lanzamiento es: "+getFechaDeLanzamiento());
        System.out.println("Duracion de minutos: "+getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }

}
