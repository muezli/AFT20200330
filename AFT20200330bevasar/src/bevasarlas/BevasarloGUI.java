/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bevasarlas;

import java.awt.Dimension;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class BevasarloGUI extends JFrame {

    static final String AppName = "Bevásárló Lista";
    static final String VersionNumber = "v0.1a";
    
    public BevasarloGUI() {
        
        setTitle(AppName + " " + VersionNumber);
        setMinimumSize(new Dimension(800, 600));
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BevasarloGUI MyGUI = new BevasarloGUI();
        MyGUI.setVisible(true);
        System.out.println("Program started!");
    }
}
