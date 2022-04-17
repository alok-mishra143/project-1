package brickbreaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gameplay extends JFrame implements KeyListener,ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    private boolean play=false;
    private int score =0;
    private int totalbrick=21;
    private Timer time;
    private int delayed=5;
    private int ballpox=120;
    private int ballpoy=350;
    private int ballxdir=-1;
    private int ballydir=-2;
    private int playerx=350;
    

    public gameplay(){

    }
    public void paint(Graphics g){
        g.setColor(Color.black);
    g.fillRect(1,1, 692, 592);

    }
    




    
}
