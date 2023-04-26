import javax.swing.JOptionPane;
public class gui {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello there "+name+"..." );

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "What an age... I remember when I was "+age+" years old........" );

        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
        JOptionPane.showMessageDialog(null,"Huh...... "+height+ " you say? That's small enough for me to crush with my pinky!!");
    }
}
