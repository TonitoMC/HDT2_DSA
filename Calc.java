import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Clase que calcula el resultado de una operacion con notacion postfix y lee archivos de texto
 * @author Jose Merida - 201105
 * @author Adrian Lopez - 21357
 * @version 1.1
 * @since 01-02-2024
 */
public class Calc {
    /**
     * Metodo para calcular el resultado de una operacion postfix
     * @param op el string que representa la operacion a calcular
     * @return el resultado de la operacion
     */
    public int postfix(String op){
        Pila<Integer> stack = new Pila<>();
        char[] arr = op.toCharArray();
        for (char p : arr){
            //Si el caracter es un digito lo agrega a la pila
            if (Character.isDigit(p)){
                stack.push(Integer.parseInt(String.valueOf(p)));
            }
            //Si no es un digito, toma los ultimos 2 digitos dentro de la pila y realiza una operacion matematica.
            //Al realizar la operacion, agrega el resultado a la pila
            else if (!(p == ' ')){
                int n1 = stack.pop();
                int n2 = stack.pop();
                switch (p){
                    case '+':
                        stack.push(n1+n2);
                        break;
                    case '-':
                        stack.push(n2-n1);
                        break;
                    case '*':
                        stack.push(n2*n1);
                        break;
                    case '/':
                        stack.push(n2/n1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    /**
     * Metodo para leer un archivo de texto a un ArrayList de Strings
     * @return ArrayList de Strings donde cada String es una linea de texto
     */
    public ArrayList<String> readTxt() {
        ArrayList<String> tempList = new ArrayList<String>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("datos.txt"))) {
            while ((line = br.readLine()) != null) {
                tempList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tempList;
    }
}