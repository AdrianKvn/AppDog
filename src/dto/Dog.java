package dto;
/**
 * Clase Dog
 * nos permite crear objetos tipo Dog con sus respectivos atributos
 * @author Adrian Luengas
 */

import java.util.ArrayList;

public class Dog {
    private String name;
    private String race;
    private ArrayList<String> colors;
    private String genre;
    private Boolean sterilization;
    public Float weight;

    /**
     * Método que nos devuelve el nombre del objeto tipo Dog
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * Este método recibe nombre como parametro
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Método que nos devuelve la raza del objeto tipo Dog
     * @return
     */
    public String getRace() {
        return race;
    }

    /**
     * Este método recibe raza como parámetro
     * @param race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * Método que retorna un arreglo de los colores del objeto tipo Dog
     * @return colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Método que recibe como parámetro un arreglo de colores
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    /**
     * Método que devuelve el valor del genero
     * @return
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Método recibe como parámetro 
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Método que devuelve el estado de Sterilization (True/false)
     * @return
     */
    public Boolean getSterilization() {
        return sterilization;
    }

    /**
     * Este método recibe como parámetro Sterilization
     * @param sterilization
     */
    public void setSterilization(Boolean sterilization) {
        this.sterilization = sterilization;
    }

    /**
     * Método que retorna el peso del objeto tipo Dog
     * @return
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Método recibe el peso del objeto tipo Dog
     * @param weight
     */
    public void setWeight(Float weight) {
        this.weight = weight;
    }

    /**
     * Este método acciona el ojeto tipo Dog a comer
     */
    public void eat(){
        System.out.println(this.name+" se está alimentando con Dog Chow");
    }

    /**
     * Este método nos retorna la información completa del objeto Dog
     * @return
     */
    @Override
    public String toString() {
        return "\nInformación Perro" +'\n'+
                "Nombre " + name + '\n' +
                "raza " + race + '\n' +
                "color " + colors +'\n'+
                "genero " + genre + '\n' +
                "¿Está esterelizado? " + statusSterilization(sterilization) +'\n'+
                "peso " + weight ;
    }

    /**
     *Método que recibe como parámetro Esterilizacón y retorna un si o un no
     * @param sterilization
     * @return si =true , no= false
     */
    public String statusSterilization(boolean sterilization){
        String msg;
        if(!sterilization){
            msg="no";
        }else {
            msg="si";
        }
    return msg;
    }

    /**
     * Este método nos permite cambiar el estado del atributo esterilización
     */
    public void changeSterilization(){
        if(sterilization){
            sterilization=false;
        }else {
            sterilization=true;
        }
    }
}
