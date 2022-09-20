/*
 * @author NeuenMartinez
 * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una 
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método 
constructor. Luego, las operaciones que se podrán realizar son las siguientes: 
• Método getDiscriminante(): devuelve el valor del discriminante (double). El 
discriminante tiene la siguiente formula: (b^2)-4*a*c 
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para 
que esto ocurra, el discriminante debe ser mayor o igual que 0. 
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para 
que esto ocurra, el discriminante debe ser igual que 0. 
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true, imprime las 2 posibles 
soluciones. 
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime una única raíz. Es 
en el caso en que se tenga una única solución posible. 
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por 
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos 
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso 
de no existir solución, se mostrará un mensaje.
 */
package POOej_Ex03;

import Entidades_Ex03.Raices;
import Servicios_Ex03.RaicesService;

public class POOej_Ex03 {

    public static void main(String[] args) {

        RaicesService rs = new RaicesService();
        Raices r1 = rs.crearRaices();
        double D = rs.getDiscriminante(r1);
        System.out.println("El discriminante es:" + D);
        rs.tieneRaices(D);
        rs.tieneRaiz(D);
        rs.obtenerRaices(D, r1);
        rs.obtenerRaiz(D, r1);
        rs.calcular(D, r1);
    }

}
