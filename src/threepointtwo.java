import javax.swing.JOptionPane;

public class threepointtwo {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Enter the Fahrenheit value you want to convert to Celsius");

        double f = Double.parseDouble(input);

        double c = (f - 32) * (5.0 / 9.0);

        JOptionPane.showMessageDialog(null,"The temperature " + f + " degrees fahrenheit is equal to " + c + " degrees Celsius");

    }
}
