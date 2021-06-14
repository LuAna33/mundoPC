package com.gm.pc;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private static int contadorComputadora;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadora;
    }
    public Computadora( String nombre, Monitor monitor,
                            Mouse mouse, Teclado teclado){
        this();//llama al construComputadora"//
        this.nombre = nombre;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", mouse=" + mouse +
                ", teclado=" + teclado +
                '}';
    }
}
