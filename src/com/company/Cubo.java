package com.company;

public class Cubo {

    //Atributo
    private String material;
    private boolean asa;
    private String color;
    private int capacidad;
    private int capacidadMax;

    //Metodos
        //Constructor
    public Cubo() {
        material="plastico";
        asa=true;
        color="negro";
        capacidad=0;
        capacidadMax=10;
    }

    public Cubo(String material, Boolean asa, String color, int capacidad, int capacidadMax){
        this.material = material;
        this.asa = asa;
        this.color = color;
        this.capacidad = capacidad;
        this.capacidadMax = capacidadMax;
    }

        //GET
    public String getMaterial() {
        return material;
    }

    public boolean isAsa() {
        return asa;
    } //preguntar

    public String getColor() {
        return color;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

        //SET
    public void setMaterial(String material) {
        this.material = material;
    }

    public void setAsa(boolean asa) {
        this.asa = asa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

        //Metodos
    public void llenarCubo(int litros){
        if (getCapacidad() < getCapacidadMax() && litros <= getCapacidadMax()){
            setCapacidad(capacidad+litros);
        } else if (getCapacidad() > getCapacidadMax()){
            System.out.println("Los litros introducidos superan a la capacidad maxima.");
            System.out.println(litros+" litros introducidos. "+(getCapacidad()-getCapacidadMax())+" litros sobranten.");
            System.out.println("La capacidad actual sera la maxima del cubo");
            setCapacidad(getCapacidadMax());
        } else if (getCapacidad() == getCapacidadMax()){
            System.out.println("El cubo esta lleno");
        }
    }

    public void vaciarCubo(int litros){
        if (getCapacidad() > 0 && litros>=0){
            setCapacidad(capacidad-litros);
        } else if (getCapacidad() < 0){
            System.out.println("Los litros introducidos no se pueden vaciar ya que no hay esos litros.");
            System.out.println(litros+" litros introducidos. "+(litros-getCapacidad())+" litros sobranten.");
            System.out.println("La capacidad actual sera la minima del cubo");
            setCapacidad(getCapacidadMax());

        } else if (getCapacidad() == getCapacidadMax()){
            System.out.println("El cubo esta vacio");
        }
    }

    public void motrarCubo(){
        for (int altura = getCapacidadMax(); altura >= 0; altura--){
            for (int base = 0; base < getCapacidadMax(); base++){
                if (base == 0 || base == getCapacidadMax()-1 || altura == 0){
                    System.out.print(" *");
                } else if(getCapacidad() >= altura) {
                    System.out.print(" ~");
                } else if (base > 0 && base < getCapacidadMax()-1){
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
