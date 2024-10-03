import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.imageio.ImageIO;

public class PlayerPanel extends JPanel implements KeyListener {
    private BufferedImage playerImage;
    private int posX = 100;
    private int posY = 100;
    private int speed = 10;
    private int playerWidth = 100;
    private int playerHeight = 100;

    public PlayerPanel() {
        try {
            playerImage = ImageIO.read(getClass().getResource("assets/player.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        setFocusable(true);
        addKeyListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (playerImage != null) {
            g.drawImage(playerImage, posX, posY, playerWidth, playerHeight, this);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_A:
                if (posX - speed >= 0) posX -= speed;
                break;
            case KeyEvent.VK_D:
                if (posX + playerWidth <= getHeight()) {
                    posX += speed;
                }
                break;
            case KeyEvent.VK_W:
                if (posY - speed >= 0) posY -= speed;
                break;
            case KeyEvent.VK_S:
                if (posY + playerHeight <= getHeight()) {
                    posY += speed;
                }
                break;
            default:
                break;
        }

        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
}
