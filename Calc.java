import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class Calc {
    public int postfix(String op){
        Stack<Integer> stack = new Stack<>();
        char[] arr = op.toCharArray();
        for (char p : arr){
            if (Character.isDigit(p)){
                stack.push(Integer.parseInt(String.valueOf(p)));
            }
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