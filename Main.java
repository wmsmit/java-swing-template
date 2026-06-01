import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create the main window frame
        JFrame frame = new JFrame("Classroom Test Window");
        
        // Create a simple text label
        JLabel label = new JLabel("It works! Swing is running on your Chromebook.", SwingConstants.CENTER);
        
        // Add the elements and set the window size
        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Center the window
        frame.setVisible(true); // Make it show up on screen
    }
}
