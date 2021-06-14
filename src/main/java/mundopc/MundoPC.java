package mundopc;
import com.gm.pc.*;

public class MundoPC {
    public static void main(String[] args) {

        Monitor monitorHP = new Monitor("HP");
        Teclado tecladoHP = new Teclado("bluetooth","HP");
        Mouse mouseHP = new Mouse("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("HP", monitorHP,mouseHP,
                tecladoHP);

        Monitor  monitorSony = new Monitor("Sony");
        Teclado tecladoSony = new Teclado("bluetooth","Sony");
        Mouse mouseSony = new Mouse("bluetooth", "Sony");
        Computadora computadoraSony = new Computadora("Sony", monitorSony,mouseSony,
                tecladoSony);

        Monitor  monitorLenovo = new Monitor("Lenovo");
        Teclado tecladoLenovo = new Teclado("bluetooth","Lenovo");
        Mouse mouseLenovo = new Mouse("bluetooth", "Lenovo");
        Computadora computadoraLenovo = new Computadora("Lenovo", monitorLenovo,mouseLenovo,
                tecladoLenovo);

        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        Orden orden3 = new Orden();

        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraLenovo);
        orden2.agregarComputadora(computadoraSony);
        orden3.agregarComputadora(computadoraSony);

        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        }
}
