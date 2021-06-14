package com.gm.pc;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private static int contadorMonitores;

    private Monitor(){
    this.idMonitor = ++Monitor.contadorMonitores;
    }
    public Monitor(String marca){
        this();// llama al constructor privado "Monitor" //
        this.marca = marca;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                '}';
    }
}