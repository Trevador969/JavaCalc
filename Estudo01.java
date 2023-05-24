import javax.swing.*;

class Estudo01
{
    public static void main (String entrada[])
    {
        //declara variavel
        int n1, n2, mod;
        double raiz01, raiz02;
        String msg = "";

        //entrada de dados

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite outro numero inteiro:"));

        //processemento 
        mod = n1 % n2;
        raiz01 = Math.sqrt(n1);
        raiz02 = Math.sqrt(n2);

        //saida de resultado
        msg = msg + "resultado da divisao de " + n1 + " por " + n2 + " = " + mod + "\n"; 
        msg = msg + "raiz quadrada de " + n1 + " = " + raiz01 + "\n";  
        msg = msg + "raiz quadrada de " + n2 + " = " + raiz02 + "\n";  
        JOptionPane.showMessageDialog(null, msg);

        System.exit(0);
    }
}