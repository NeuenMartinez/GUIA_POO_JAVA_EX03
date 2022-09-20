package Servicios_Ex03;

import Entidades_Ex03.Raices;
import java.util.Scanner;

/**
 *
 * @author NeuenMartinez
 */
public class RaicesService {

    Scanner leer = new Scanner(System.in);

    public Raices crearRaices() {
        System.out.println("Ingresar el valor de 'a':");
        int a = leer.nextInt();
        System.out.println("Ingresar el valor de 'b':");
        int b = leer.nextInt();
        System.out.println("Ingresar el valor de 'c':");
        int c = leer.nextInt();
        return new Raices(a, b, c);
    }

    public double getDiscriminante(Raices r) {
        return (r.getB() * r.getB()) - 4 * r.getA() * r.getC();
    }

    public boolean tieneRaices(double d) {
        if (d > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz(double d) {
        return d == 0;
    }

    public void obtenerRaices(double d, Raices r) {
        if (tieneRaices(d) == true) {
            System.out.println("Raiz 1:" + (-r.getB() + Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
            System.out.println("Raiz 2:" + (-r.getB() - Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
        }
    }

    public void obtenerRaiz(double d, Raices r) {
        if (tieneRaiz(d) == true) {
            System.out.println("Raiz:" + (-r.getB() + Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
        }
    }

    public void calcular(double d, Raices r) {
        if (tieneRaices(d) == true) {
            System.out.println("La ecuacion tiene dos raices:");
            System.out.println("Raiz 1:" + (-r.getB() + Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
            System.out.println("Raiz 2:" + (-r.getB() - Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
        } else if (tieneRaiz(d) == true) {
            System.out.println("La ecuacion tiene una raiz:");
            System.out.println("Raiz:" + (-r.getB() + Math.sqrt((r.getB() * r.getB()) - (4 * r.getA() * r.getC()))) / (2 * r.getA()));
        } else {
            System.out.println("La ecuacion no tiene raices!");
        }
    }
}
