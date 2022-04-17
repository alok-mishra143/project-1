package brickbreaker;//this is our package 

import javax.swing.JFrame;//importing jframe
import java.awt.*;//importing java.awt.* for geting the comtainer information

public class main {   //  creating main class
    public static void main(String[] args) {//  creating main 
        JFrame j1=new JFrame(); //making j1 as a Jframe object
        j1.setVisible(true);//setting the visibility of frame
        j1.setBounds(100,100,600,500);//setting the distance between x and y and also setting the frame hight and width
        j1.setTitle("alok kirtan project brick breaker game");// setting the tittle for game
        j1.setResizable(false);//usig this so that user can`t resize the window
        j1.setDefaultCloseOperation(j1.EXIT_ON_CLOSE);//when user close the frame so program stop 
        // Container c=j1.getContentPane();//getting container for bg color
        // c.setBackground(Color.BLACK);// setting bg color
       

        gameplay g1=new gameplay();//making gameplay class method g1
        j1.add(g1);//adding in frame 
    }
    
}
