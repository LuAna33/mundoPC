package com.gm.pc;

import java.sql.SQLOutput;

public class Orden {

    private int idOrden;
    Computadora[]computadoras;
    private static int contadorOrdenes;
    private static int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    public void agregarComputadora (Computadora computadoras){
        if(contadorComputadoras < MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadoras;
        }
        else{
            System.out.println("Ha llegado al limite de computadoras a ingresar" + Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden (){
        System.out.println("Numero de Orden " + this.idOrden);
        for (int i = 0 ; i < this.contadorOrdenes; i++){
            System.out.println(this.computadoras[i]);
        }
    }

}
