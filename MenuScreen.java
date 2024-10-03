import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuScreen extends JFrame {
    
    public MenuScreen() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);

        JButton playButton = new JButton("Play");
        playButton.setBounds(150, 150, 100, 50);
        add(playButton);

        playButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e) {
                GameScreen gameScreen = new GameScreen();
                gameScreen.setVisible(true);
                dispose();
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
