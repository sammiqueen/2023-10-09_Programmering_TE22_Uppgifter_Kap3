import javax.swing.JOptionPane;

public class threepointone {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog(null,"Input Sphere Area (cm)");

        double r = Double.parseDouble(input);

        double a = 4 * Math.PI * Math.pow(r,2);
        double v = (4 * Math.PI * Math.pow(r,3)) / 3;

        JOptionPane.showMessageDialog(null,"The Sphere has the area " + a + " cm^2 and the volume " + v + " cm^3");

    }
}
