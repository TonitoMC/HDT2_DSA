/**
 * Este programa lee un archivo de texto con una operacion con notacion postfix por linea
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */

public class Main {
    public static void main(String[] args) {
        //Crea una calculadora nueva
        Calc calc = new Calc();
        //Para cada String creado a partir de una linea de texto, se obtiene su resultado y se imprime.
        for (String p : calc.readTxt()){
            System.out.println(calc.postfix(p));
        }
    }
}