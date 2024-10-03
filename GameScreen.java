import javax.swing.JFrame;

public class GameScreen extends JFrame {
    
    public GameScreen() {
        setTitle("Title");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        add(new PlayerPanel());

        pack();
        setLocationRelativeTo(null); // center the window
        setVisible(true);
    }
}
