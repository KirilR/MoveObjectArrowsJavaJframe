package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;

public class moving extends JPanel implements ActionListener, KeyListener {

    Timer t = new Timer(10, this);
    double x=0,y=0, velx=0, vely=0;
    public moving(){
       t.start();
       addKeyListener(this);
       setFocusable(true);
       setFocusTraversalKeysEnabled(false);

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x,y,30,30));

    }

    public void actionPerformed(ActionEvent e){
        repaint();
        x+=velx;
        y+=vely;
    }
    public void up(){
        vely = -0.8;
        velx=0;
    }

    public void down(){
        vely= 0.8;
        velx=0;
    }

    public void left(){
        velx = -0.8;
        vely = 0;
    }

    public void right(){
        velx=0.9;
        vely=0;
    }

    public void stop(){
        velx=0;
        vely=0;
    }

    public void keyPressed(KeyEvent e){
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP){
           up();
        }
        if(code == KeyEvent.VK_DOWN){
            down();
        }
        if(code == KeyEvent.VK_LEFT){
            left();
        }
        if(code == KeyEvent.VK_RIGHT){
            right();
        }
        if(code ==KeyEvent.VK_SPACE){
            stop();
        }
    }
//mandatory to comply interface- those both methods
    public void keyTyped(KeyEvent e){

    }
    public void keyReleased(KeyEvent e){

    }

}
