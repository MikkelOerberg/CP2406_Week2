package Task2.ProgrammingExercises;

import javax.swing.JOptionPane;

public class NauticalMilesInteractive {
    public static void main(String[] args)
    {
        double kilometers = 1.852;
        double miles = 1.150779;
        String NauticalMiles ;
        int nautical;
        NauticalMiles = JOptionPane.showInputDialog(null, "Enter number of nautical miles",
                JOptionPane.INFORMATION_MESSAGE);
        nautical = Integer.parseInt(NauticalMiles);
        JOptionPane.showMessageDialog(null,nautical + " Nautical miles corresponds to " +
                        (nautical * kilometers) + " kilometers and " + (nautical * miles) + " miles");
    }

}
