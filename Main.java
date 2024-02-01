public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        for (String p : calc.readTxt()){
            System.out.println(calc.postfix(p));
        }
    }
}